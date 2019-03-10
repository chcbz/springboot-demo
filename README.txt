1、将maven目录下的settings.xml文件复制到用户目录下的.m2目录里(如：C:\Users\Think\.m2\settings.xml)
2、在eclipse中点菜单File->Import->Existing Maven Projects，并选择code目录。
3、将sql目录中的建表语句在数据库中执行。
4、在eclipse中打开项目，修改application.properties中的数据库连接信息。
5、右击SpringbootDemoApplication.java文件，选择Run As -> Spring Boot App。
6、启动成功后，在浏览器上访问http://localhost:8080/get-by-email?email=c@c.com