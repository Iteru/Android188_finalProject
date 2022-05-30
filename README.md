
# Itas 188 - Mobile Development
## Year 1, Semester 2

***

**NOTE:** I wrote a lot of comments. To make it easier to wade through the code, close all tags within the current class using _ctrl + shift + "-"_ and open them as needed. 

_I will be covering what I would have done differently, and what else I wanted to include in the video, which can be found in the root folder in the "Presentation" folder._



***

<br>
<br>

> ##### 1. **Is the app buggy?**
>As far as I'm aware, the app is not overly buggy. The only things that I noticed that 
could be seen as "buggy" were: 
> -  The sprite's movement was hindered or lagged if the joystick was engaged too early in the game.
Although I'm unsure of the cause, I coined it up to my phone being a piece of trash. If that isn't the issue, I would imagine it had to do with the _Frames Per Second_ rate and the _Updates Per Second_ rate.
> - The map sprites were a little stretched. I'm assuming it was because during the tutorial, the og creator divided the amount of pixels on his screen by 64px(per sprite) and got 60 tiles total to cover it. My device, I believe has a larger screen, and when using the same formula, created the stretched background. 

<br>

>##### 2. **What steps need to be taken for configuration?**
>Nada. This is a strict Java app, with basic deployment. 

<br>

>##### 3. **Links to tutorials**
> Here is the Link to the [Android Studio 2D Game Development](https://www.youtube.com/watch?v=joO-0w0qd7k&list=PL2EfDMM6n_LYJdzaOQ5jZZ3Dj5L4tbAuM&index=2) that I used to help me create this funial project.
> The downloading of GIMP was also required to create the sprites

<br>

>##### 4. What code was my own?
> hahaha... none of it. **HOWEVER**, I typed _everything_, copied and pasted _nothing_, wrote **COPIOUS** notes, and _changed_ a couple minor thing: 
> - **MAX_UPS** - _GameLoop.java_ class on _line 13_. 
>This was class and code is to keep the _Updates Per Second_ at a steady rate, and not slow down the game loop, amongst other things, like a _sleepTime_ to skip frames. I needed to adjust my code to increase the _MAX_UPS_ from 30 updates per second to 80. I spent some time to get my phone to do what this guy's was doing, and I figured changing these numbers worked, but I don't have the brain space to fully figure out and describe why;
> - **SPEED_PIXELS_PER_SECOND** - _Enemy.java, line 12_; 
> - **SPAWNS_PER_MINUTE and SPAWNS_PER_SECOND** - _Enemy.java, lines 14 and 15_
> - **Colour** - _Enemy.java, line 28 and colors.xml, line 12_.
> - **Spell radius and colour** - _Spell.java, line 22_ **+** _colors.xml, line 13_.
<br>

>##### 5. Here is the link to the [GitHub Repository](https://github.com/Iteru/Itas188_FinalProject).

<br>

>##### 6. Did you work in a group?
>In the technical sense, no; but I don't consider this project to be only mine, since I followed a tutorial.

<br>

>##### 7. What problems did you run into?
>Oh my gawd, so many. The main issue I had was to do with the issue discussed in number 4 (above), with the _MAX_UPS_. That took a couple hours. 
>
>Other problems I came across mainly had to do with my own faults, such as missing punctuation, files being created in the wrong folders by default (which threw me through a effing loop for the longest time), inability to comprehend spoken word at the average rate, and waning interest. 
>
>The _main_ issue I had that took the most time to correct was when the tutorial guide said to place some of the classes within a newly created "object" folder. _EVEN AFTER_ changing the necessary variables to public, rather than private, _and_ adjusting the import paths, I still had issues with classes recognizing imports from their parent classes. I ended up trying a few things to bring back the original success. These included moving them back out and I tried this within android studio and in the windows explorer(didnt work); copying and pasting the codes from each of these classes (about 5) into a notepad document, deleting the original class files, creating new ones and pasted the code back into it (didnt work), and then finally, while keeping the codes within the notepad document, deleted the correlating classes, and re-creating them again by using _atl + enter -> "show quick fixes" -> "create new class x"_ to create the classes from that approach, then pasting the code back into that.
>
>As you can probably imagine, it felt like walking through a house of mirrors without depth perception. 


