

import os
import discord
# from dotenv import load_dotenv
from datetime import datetime

# load_dotenv()
TOKEN = "MTE3OTk5Njc1NjgyMjQ3MDY3Ng.GwJ6yk.60isSHqRW2r1U-EX7OTnu3SWhriukr-B053fss"
GUILD = "Balvindra's server"
fname = "memberLogon.csv"

intents = discord.Intents.default()
intents.members = True

client = discord.Client(intents=intents)

# Creating method to load prev data


def loadData(file):
    with open(file, 'r') as f:
        csv_raw = f.read()
        csv = csv_raw.split("\n")
        for i in range(len(csv)):
            csv[i] = csv[i].split(',')
        return csv

# Creating method to save 


def saveData(csv, file):
    csv_joinRows = []
    for row in csv:
        csv_joinRows.append(','.join(row))
    csvRebuilt = "\n".join(csv_joinRows)
    with open(file, "w") as f:
        f.seek(0)
        f.write(csvRebuilt)
        f.truncate()


# Even if Ready
@client.event 
async def on_ready():
    guild = discord.utils.get(client.guilds, name=GUILD)
    csv = [["User","Last Login"]]
    for member in guild.members:
        csv.append([member.name, str(datetime.now())])
    saveData(csv, fname)


@client.event
async def on_member_join(member):
    print(member.name)
    csv = loadData(fname)
    csv.append([member.name, str(datetime.now())])
    saveData(csv, fname)


@client.event
async def on_member_remove(member):
    print(member.name)
    csv = loadData(fname)
    for i in range(len(csv)):
        if csv[i][0] == member.name:
            csv.pop(i)
            break
    saveData(csv, fname)

# Run the bot
client.run(TOKEN)