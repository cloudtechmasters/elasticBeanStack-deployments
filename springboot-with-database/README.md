# Deploy Springboot with database application with Elastic Bean Stack

# Pre-Requisites
    Springboot Application
    Install Maven
# Clone code using below command
    git clone https://github.com/Naresh240/springboot-application-elastiBeanStack.git
    cd springboot-application-elastiBeanStack/springboot-with-database
# Build Artifact
    mvn clean install
# Open Elastic Bean Stack Console and deploy application
  ![image](https://user-images.githubusercontent.com/58024415/105579812-cc681d00-5dae-11eb-8f3b-7738ec47b0df.png)
  
  Click on Create Application
  
  ![image](https://user-images.githubusercontent.com/58024415/105581434-94b0a380-5db5-11eb-8132-54a09e1ce379.png)

  Click on Configure more options
  
  ![image](https://user-images.githubusercontent.com/58024415/105583705-3b953f80-5db6-11eb-9de0-74ca6deb79bc.png)
  
  Click on Edit in Database
  
  ![image](https://user-images.githubusercontent.com/58024415/105584587-78f9cd00-5db6-11eb-9540-0ad6ab9e3299.png)

  Provide database username and password and click on save and then click on Create App
  
  ![image](https://user-images.githubusercontent.com/58024415/105585517-bb230e80-5db6-11eb-9dea-2c226c0b50c6.png)

  It will create database and deployment environment.
  
  ![image](https://user-images.githubusercontent.com/58024415/105590248-038efc00-5db8-11eb-91a8-17057c779f87.png)

  Click on Upload and deploy
  
  ![image](https://user-images.githubusercontent.com/58024415/105590628-202b3400-5db8-11eb-9084-09d66dc6c290.png)

  Upload jar file and click on Deploy
  
  ![image](https://user-images.githubusercontent.com/58024415/105592894-c1b28580-5db8-11eb-895c-9dfbe964621c.png)
  
  Open Postman App and provide details as shown below
  
  ![image](https://user-images.githubusercontent.com/58024415/105592786-b95a4a80-5db8-11eb-9792-fd58210dbce1.png)
  
  Click on Send and it will create one record on table.
  
  Check wether record is created or not using Get API.
  
  ![image](https://user-images.githubusercontent.com/58024415/105593837-02120380-5db9-11eb-95eb-7a10ef436efb.png)
