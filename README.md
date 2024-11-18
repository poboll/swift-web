<h4 align="right"><strong>English</strong> | <a href="README_CN.md">简体中文</a></h4>

<p align="center">
    <img src="favicon.jpg" width="168"/>
</p>

<h1 align="center">SwiftWeb</h1>
<p align="center"><strong>Build web applications quickly with SwiftWeb. It integrates Knife4j for API documentation, allows custom error codes, and provides a global exception handler—all within SwiftWeb.</strong></p>

<div align="center">
    <img alt="Maven" src="https://raster.shields.io/badge/Maven-3.8.1-red.svg"/>
    <img alt="SpringBoot" src="https://raster.shields.io/badge/SpringBoot-2.7+-green.svg"/>
    <a href="https://blog.caiths.com/">
        <img alt="Blog" src="https://raster.shields.io/badge/Blog-poboll-blue.svg"/>
    </a>
    <img alt="Knife4j" src="https://raster.shields.io/badge/Knife4j-3.0+-orange.svg"/>
</div>

## Quick Start 🏁

Follow these simple steps to get started with SwiftWeb:

1. Create a SpringBoot project without adding the <span style="color:red">Web dependencies</span>.

2. Add the SwiftWeb dependency coordinates:

```xml
<dependency>
    <groupId>com.caiths</groupId>
    <artifactId>swift-web</artifactId>
    <version>0.0.2</version>
</dependency>
```

3. Configure the application, ensuring that the <span style="color: red">Controller and matching strategy: ant_path_matcher</span> are set:

- Simplified configuration:

```yml
knife4j:
  config:
    scan-path: com.caiths.demo.controller
    spring:
      profiles:
        active: dev
      mvc:
        path match:
          matching-strategy: ant_path_matcher
```

- Full configuration:

```yml
knife4j:
  config:
    name: Author
    email: xxx
    version: API version
    title: API Documentation
    description: API documentation description
    scan-path: com.caiths.demo.controller
spring:
  profiles:
  active: dev
  mvc:
    path-match:
      matching-strategy: ant_path_matcher
```

4. Refresh the dependencies.

## Why Choose SwiftWeb? 😎

**SwiftWeb simplifies the web development process compared to traditional methods by integrating essential features such as API documentation, error code management, and exception handling right out of the box.**

- Traditional web project setup:

    1. Create a new project.
    2. Write a global exception handler.
    3. Integrate API documentation.
    4. Customize error codes.
    5. Create a common return class.
    6. Write business logic.

- With **SwiftWeb**:

    1. Create a new project.
    2. Add the SwiftWeb dependency.
    3. Configure scanning paths and policies.
    4. Write business logic.

## Features 🌟

SwiftWeb offers a variety of features that make web development quicker and more efficient:

- Fast web application setup.
- Simple and intuitive API integration.
- Customizable for various web application needs.
- And more!

## Contribution 🤝

If you have any questions or suggestions about SwiftWeb, feel free to contact us anytime via email: [📩Email](mailto:caiths@icloud.com).

## Contact Us 📩

For any questions or feedback, feel free to [contact us](mailto:caiths@icloud.com).

Thank you for choosing SwiftWeb! 😊