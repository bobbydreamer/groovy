# Git-Groovy Usage

Groovy lessons are saved in respective branches from less1 to less9. 

```
git branch
```

Below are the list of branches and lessons

* `less1` contains hello world programs
* `less2` contains introduction to math functions
* `less3` - String Operations
* `less4` - Inputs/Outputs
* `less5` - Lists and Maps
* `less6` - Logical Conditions and Loops
* `less7` - Functions
* `less8` - Closures
* `less9` - Files
* `master` - This is the main branch

* * * 

Say you want to work on lesson 1 which is "Hello World" groovy programs. 

```
git checkout less1

# There will be a folder called "1.HelloWorld" go into the folder 

cd 1<<press tab>>
# (or type the full name)
cd 1.HelloWorld

# Execute programs like 
groovy a<<press tab - it will automatically fill the remaining name>>
# (or type full program name like below)
groovy a_hello_world.groovy

# To switch to a different branch or lesson
cd..

git checkout less2

```

* * * 

If you make any changes to the programs while testing and if you want to switch to master without saving or commiting. You will get below error message. 

```
git checkout master
error: Your local changes to the following files would be overwritten by checkout:
        1.HelloWorld/a_hello_world.groovy
Please commit your changes or stash them before you switch branches.
Aborting
```

Follow below steps to handle it, 

1. Come out of folder `1.HelloWorld` by doing `cd..`
2. Issue `git stash` -- By doing this you are stashing/saving all current uncommitted changes in git temporarily 
3. Then issue `git checkout master`

* * * 

If you want to save your changes in the branch were you are testing

```
git add .
git commit -m "Your message"
```