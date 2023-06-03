INSTALLATIONS:
(MySQL Community Server - GPL)
(download link: https://drive.google.com/file/d/1vhCZ6oGAIiRNTQbm-_KF3llQIzaV_dL9/view?usp=share_link )
1)MySQL Server 8.0.31
2)MySQL Workbench 8.0.31
  username- root
  password- root
3)MySQL  Shell 8.0.31
4)Eclipse IDE for enterprise and web developers
(download link: https://drive.google.com/file/d/1m05edw6hP2Q3Rrp0kkQzuBaXWc3ak0kf/view?usp=share_link )

After installations,  
1)In MySQL workbench, create a schema called admin under that create a employee table

2)In Eclipse IDE , create a java project called JDBC and select JavaSE-1.8 for execution environment JRE

3)Under the project create a package called CrudOperations and in that package create a new class

4)In google search for maven repository, in that download a jar file of  MySQL Connector Java(type 4 jdbc driver) of version 8.0.28 (which has highest number of usages)

5)After downloading a jar file, in eclipse ide right click on JDBC project and select configure build path under build path option, 
there go to libraries select add external jar file and copy the path of jar file that you have downloaded for mysql connector
