package cse.cs;

public interface HelpDocument {}

	// git is nothing but distributed  version control system
	//create one repository in gitHub
	//create one mvn project in localEclipse workspace

      //create index page in resources/templates path
      // add maven dependency fro thymeleaf
 
    //why we need local repository
       //local repository is nothing but duplicate copy of remote repository 
   //if remote server fails we can work with local repository 
	
	
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



     //Staging changes in Git Extensions is the same as using git add on the Git command line.

    //You need to stage deleted files because you stage the change and not the file. If you have staged changes from a file and you wish to exclude those changes from the commit, 
	//select the entry in the staged changes pane and press the Unstage button or press the [U] key.




		//Add a Home Page
 		//Static resources, like HTML or JavaScript or CSS, can easily be served from your Spring Boot application
        //just be dropping them into the right place in the source code. 
        //By default Spring Boot serves static content from resources in the classpath at "/static" 
         //(or "/public"). The index.html resource is special because it is used as a "welcome page" 
       //if it exists, which means it will be served up as the root resource, i.e. at http://localhost:8080/ i





//Thymeleaf allows you to process six kinds of templates, each of which is called a Template Mode:

//XML
//Valid XML
//XHTML
//Valid XHTML
//HTML5
//Legacy HTML5
//All of these modes refer to well-formed XML files except the Legacy HTML5 mode, which allows you to process HTML5 files with features such as standalone (not closed) tags, tag attributes without a value or not written between quotes. In order to process files in this specific mode, Thymeleaf will first perform a transformation that will convert your files to well-formed XML files which are still perfectly valid HTML5