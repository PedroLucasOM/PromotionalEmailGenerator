<h1 align="center" width="100vw">
  <img alt="Logo: PromotionalEmailGenerator" src="https://github.com/PedroLucasOM/PromotionalEmailGenerator/blob/master/logo.png" />
</h1>
<p>
  <img alt="Version" src="https://img.shields.io/badge/version-1.0.0-green.svg?cacheSeconds=2592000" />
  <img src="https://img.shields.io/badge/java-11-green.svg" />
  <img src="https://img.shields.io/badge/spring-2.4.5-green.svg" />
  <a href="https://github.com/PedroLucasOM/PromotionalEmailGenerator#readme" target="_blank">
    <img alt="documentation" src="https://img.shields.io/badge/documentation-yes-green.svg" />
  </a>
  <a href="https://github.com/PedroLucasOM/PromotionalEmailGenerator/graphs/commit-activity" target="_blank">
    <img alt="maintenance" src="https://img.shields.io/badge/maintained-yes-green.svg" />
  </a>
  <a href="https://twitter.com/PedroLucasOM" target="_blank">
    <img alt="Twitter: PedroLucasOM" src="https://img.shields.io/twitter/follow/PedroLucasOM.svg?style=social" />
  </a>
</p>

> :computer: Spring Batch Application to send promotional emails :mailbox: to clients inside of a configured Datasource with Docker :whale:.

# Topics

1. [About SpringBatch](https://github.com/PedroLucasOM/PromotionalEmailGenerator#1-about-springbatch)
2. [About the Project](https://github.com/PedroLucasOM/PromotionalEmailGenerator#2-about-the-project)
    - [Implemented Job](https://github.com/PedroLucasOM/PromotionalEmailGenerator#implemented-job)
    - [Prerequisites](https://github.com/PedroLucasOM/PromotionalEmailGenerator#prerequisites)
    - [Configuration](https://github.com/PedroLucasOM/PromotionalEmailGenerator#configuration)
    - [Run](https://github.com/PedroLucasOM/PromotionalEmailGenerator#run)
    - [Usage](https://github.com/PedroLucasOM/PromotionalEmailGenerator#usage)
    - [Stop](https://github.com/PedroLucasOM/PromotionalEmailGenerator#stop)
3. [Author](https://github.com/PedroLucasOM/PromotionalEmailGenerator#3-author)
4. [Contributing](https://github.com/PedroLucasOM/PromotionalEmailGenerator#4-contributing-)
5. [Show your support](https://github.com/PedroLucasOM/PromotionalEmailGenerator#5-show-your-support)
6. [License](https://github.com/PedroLucasOM/PromotionalEmailGenerator#6-license-)


# 1. About SpringBatch

It is a framework that uses the Java Virtual Machine and the Spring Ecosystem to build batch applications. By definition, batch systems are systems that realize a process of a finite amount of data without interaction or interruption.

To learn more about this framework, view this article on the Notion:
[SpringBatch Article](https://www.notion.so/Spring-Batch-4cc5c3c22b9b49c58f6c4e23097c3c9a)

# 2. About the Project

## Implemented Job

It's a job responsible to execute one step that will read clients and products from a configured datasource, process this data linking the product interest to each client and writing and sending an email to the configured recipients two times for each 60 seconds.

## Prerequisites

- docker

## Configuration

To configure this job, you need to follow some steps: 

- First, you need to create an account at [MailTrap](https://mailtrap.io/)
- Create a new inbox
- View the SMTP Setting and get the **user** and **password**
- With these informations, you need to open the env file [.env](https://github.com/PedroLucasOM/PromotionalEmailGenerator/blob/master/.env) and put this data at **EMAIL_USER** and **EMAIL_PASSWORD**
- After it, you need to get two email addresses you have access to
- Open the file [database.sql](https://github.com/PedroLucasOM/PromotionalEmailGenerator/blob/master/src/main/resources/scripts/database/database.sql)
- In the lines 30 and 31, you will put these email addresses instead of **'cora75@hotmail.com'** and **'domingo56@yahoo.com'**

## Run

With the docker started, execute this command at the project root:

```sh
docker-compose up -d --build
```

## Usage

### Seeing the emails in the mailtrap panel

Navigate to your Mailtrap Panel and see the sended emails to the respective recipients.

### Seeing the emails in the configured recipients

Navigate to your inbox of the emails that you putted like recipients and see the messages.


## Stop

To stop correctly:

```sh
docker-compose down -v
```

Remember to execute this command each time that you want change the parameter value.

# 3. Author

👤 **Pedro Lucas**

* Twitter: [@PedroLucasOM](https://twitter.com/PedroLucasOM)
* Github: [@PedroLucasOM](https://github.com/PedroLucasOM)
* LinkedIn: [@PedroLucasOM](https://linkedin.com/in/PedroLucasOM)

# 4. Contributing 🤝

Contributions, issues and feature requests are welcome!<br />Feel free to check [issues page](https://github.com/PedroLucasOM/PromotionalEmailGenerator/issues).

# 5. Show your support

Give a :star: if this project helped you!

# 6. License 📝

Copyright © 2021 [Pedro Lucas](https://github.com/PedroLucasOM). <br />
