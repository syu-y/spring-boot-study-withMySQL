# spring-boot-study

## Environment
* Windows10 Home
* Visual Studio Code 1.36.1
* jdk1.8.0_211

## Introduce
### Step0
You already installed VScode.
Next, You need some Plugins.
* Japanese Language Pack for Visual Studio Code
* Java Extension Pack
* Spring Boot Extension Pack
* Lombok Annotations Support for VS Code  

Last, You will configure Java:Home.
### Step1
You already have VScode and JDK installed and configured.  
You have to Spring Boot Project.  
> Ctrl + Shift + P  -->  Spring Initializr: Generate a Maven Project  
> Specify project langueage -->  Select Java  
> Input Group Id for your project. --> Input Group ID  
> Input Arifact Id for your project. --> Input Arifact ID  
> Specify Spring Boot version --> Select 2.1.6  
> Search for dependencies belows.  
> > Spring Web Starter  
> > Spring Boot DevTools  
> > Lombok  
> > Thymeleaf  
> Push Selected 4 dependencies.  
### Step2
Make any ApplicationClass and ControllerClass.  
Next push debug start then need to write ``` "console": "integratedTerminal" ``` in **launch.json**.
### Step3
If you have successfully built with the settings above, please skip here.  
If not, you write ``` server.port=XXXX ``` in **application.properties**, XXXX is any port.
