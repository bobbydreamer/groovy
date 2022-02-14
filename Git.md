# Git Basics

## Install Git

## Initial Settings

```
git config --local user.name "<<your-name>>"
git config --local user.email "<<your.email.address>>@<<office-domain.com>>"

git config --global user.name "<<your-name>>"
git config --global user.email "<<your.email.address>>@<<office-domain.com>>"
```

* * * 

## git add and commit
In order for git to track files, you need to add it to git repository and commit it. 

```
git add .
git commit -m "<<meaningful message>>"
```

* * * 

## git log 

Show commits made in the repository in reverse chronological order. (ie., latest at top ).  

```
git log
```

By default outputs of git log are lengthy, in order to squeeze information and view it in a different format. We can create a new alias command to view log. Like below 

```
git log --graph --pretty=format:'%C(yellow)%h%Creset -%C(cyan)%d%Creset %s %Cgreen(%cr) %C(magenta)<%an>%Creset' --date=relative

-- Creating a alias command
git config --global alias.lol "log --graph --pretty=format:'%C(yellow)%h%Creset -%C(cyan)%d%Creset %s %Cgreen(%cr) %C(magenta)<%an>%Creset' --date=relative"
```

* * * 

## git clone
Creating a local copy of a remote repository

```
git clone https://
```

* * * 

## git branch

* Branches allow us to work on different versions of the same file in parallel. Edits on one branch is independent of other branch.
* At later point it can be decided whether to merge or not.
* Default branch was called Master after BLM(BlackLivesMatter) protests in 2020 its been changed to 'main'

Using below command, you can list all the branches in the repo

```
git branch
```

Use below command to create a branch 

```
git checkout -b <<branch-name>>
```

* * * 

## git checkout

* Switches the currently active branch to a specific commit
* Updates the files in the working directory to reflect that commit point.

```
git checkout less1

-- To get back to master or main branch
git checkout master    
(or)
git checkout main
```

* * * 

## git stash

Used for temporarily saving half-works in a stack storage.

There are scenarios where, after moving into a branch, you would make changes to the files in the branch temporarily with no intention of committing it. In those cases just issue `git stash` which moves all the uncommitted changes to the stack storage and clears up working directory. 

```
git stash
git stash list
git stash pop

git stash clear
```
