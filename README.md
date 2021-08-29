# The Hidden
A Minecraft Spigot plugin that is similar to the old source game "The Hidden"

## Setup(for coding and editing the project)

First off you are going to need a few things before you can launch the project. You are going to get a paper server jar which can be downloaded here: https://papermc.io/downloads

Next you are going to need to put the papermc jar into the server folder and rename the prefix(paper-{build-number}) to "server". After this double click on the "run.bat" file. After the server files have been generated, you will have to open the "eula.txt" file and change the `eula` var boolean value from `false` to `true`. If the "eula.txt" file does not exist then make one and paste this: `eula=true`. Make sure to save the file and then close. Then re-run "run.bat". The server script will then generate your minecraft world and build and load the server using your localhost as the endpoint!

Next you will want to download the spigot api. Go to: https://hub.spigotmc.org/nexus/content/repositories/snapshots/org/spigotmc/spigot-api/ and download the relievent jar snapshot that is for your version of Minecraft (indicated by the build number of the spigot-api). Then, finally, add this jar to your project dependencies. 

You must make sure that your project's jar is building into the plugins folder when it is being generated, this will save a lot of time and you don't have to mess with changing and moving around files a bunch. 
