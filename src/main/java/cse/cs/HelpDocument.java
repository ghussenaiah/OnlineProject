package cse.cs;

public interface HelpDocument {}

	
	//create one repository in gitHub
	//create one mvn project in localEclipse workspace
	
	
	//	Change the current working directory to your local project.
	// 	Initialize the local directory as a Git repository.
	// $  git init
	
	
	//Add the files in your new local repository. This stages them for the first commit.

	// $ git add .
	//# Adds the files in the local repository and stages them for commit. To unstage a file, use 'git reset HEAD YOUR-FILE'.
	
	
	//Commit the files that you've staged in your local repository.

	//$ git commit -m "First commit"
	//# Commits the tracked changes and prepares them to be pushed to a remote repository. To remove this commit and modify the file, use 'git reset --soft HEAD~1' and commit and add the file again.


	//At the top of your GitHub repository's Quick Setup page, click  to copy the remote repository URL.

	//In the Command prompt, add the URL for the remote repository where your local repository will be pushed.

	//git remote add origin remote repository URL
	//# Sets the new remote
	//git remote -v
	//# Verifies the new remote URL




	//Push the changes in your local repository to GitHub.

	//git push origin master
	//# Pushes the changes in your local repository up to the remote repository you specified as the origin

    //to pull code from remote
    //git pull https://github.com/ghussenaiah/OnlineProject.git master

    //each repository having thire own api to pull and push code
    //each repository having many branches  ex:-  master,beta


     // integrate our project with git local repository with url username and password
     //instead of giving every time

