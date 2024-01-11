# FolderUtils-Download-Java-Files
FolderUtils-Download-Java-Files

| [English](README.md)  | [Español](README_ES.md) | [German](README_DE.md) | [Japanese](README_JP.md) |
|------| ---- | ---- | ---- |

[![GitHub release](https://img.shields.io/github/release/Happyuky7/FolderUtils-Download-Java-Files.svg)](https://github.com/Happyuky7/FolderUtils-Download-Java-Files/releases/tag/1.0.1)
[![GitHub issues](https://img.shields.io/github/issues/Happyuky7/FolderUtils-Download-Java-Files.svg)](https://github.com/Happyuky7/FolderUtils-Download-Java-Files/issues)
[![GitHub license](https://img.shields.io/github/license/Happyuky7/FolderUtils-Download-Java-Files.svg)](https://github.com/Happyuky7/FolderUtils-Download-Java-Files/blob/master/LICENSE)
[![GitHub stars](https://img.shields.io/github/stars/Happyuky7/FolderUtils-Download-Java-Files.svg)]()

[My website](https://happyrogelio7.xyz), My website 

[My Server Discord](https://discord.gg/3EebYUyeUX), Support My Server Discord

[Kaory Studios](https://kaorystudios.xyz), Support Kaoty Studios

[Kaory Studios Discord](https://discord.gg/Gw7m8kC), Support Kaoty Studios

## Maven:

### Repository:
```xml
<repository>
    <id>jitpack.io</id>
    <url>https://jitpack.io</url>
</repository>
```

### Dependency:
```xml
<dependency>
    <groupId>com.github.happyuky7</groupId>
    <artifactId>FolderUtils-Download-Java-Files</artifactId>
    <version>1.0.1</version>
</dependency>
```

## Gradle:

### Repository:
```groovy
repositories {
    maven { url 'https://jitpack.io' }
}
```

### Dependency:
```groovy
dependencies {
    implementation 'com.github.happyuky7:FolderUtils-Download-Java-Files:1.0.1'
}
```

## Usage:

### Download File:

This library is very easy to use, just do what a "try", as in the example below.

```java

try {
    System.out.println("Downloading file...");

    FolderDownloadUtils.downloadFile("url/download/file.extension", "folder/file.extension");
    
    System.out.println("File downloaded!");

} catch (MalformedURLException e) {

    System.out.println("Download file Error!");

    e.printStackTrace();
}

System.out.println("Download file success!");

```

Inside the "try", you import the class and the downloadFile option as shown below in the example.

In the first part we put the URL that downloads the file example: 

"https://github.com/Happyuky7/FolderUtils-Download-Java-Files/releases/download/1.0.1/FolderUtils-Download-Java-Files.jar" 

in case it doesn't end with ".file extension" it won't work.

```java
FolderDownloadUtils.downloadFile( ***--->"url/download/file.extension"<---***
```

---

then in the second part we put the folder where the file will be saved here another example:

"C:/Users/Admin/Desktop/Archive/FolderUtils-Download-Java-Files.jar"

```java
FolderDownloadUtils.downloadFile("url/download/file.extension", ***--->"folder/file.extension"<---***);
```

---

The result of the example would be:

```java

import com.github.happyuky7.testdownload;

public class Main {

    public static void main(String[] args) {
        try {
            System.out.println("Downloading file...");
            
            FolderDownloadUtils.downloadFile("url/download/file.extension", "folder/file.extension");
            
            System.out.println("File downloaded!");
            
        } catch (MalformedURLException e) {
            
            System.out.println("Download file Error!");
            
            e.printStackTrace();
        }
        
        System.out.println("Download file success!");
        
    }
}

```



---

## Join us

* Feel free to open a PR! We accept contributions.
* [Discord](https://discord.gg/3EebYUyeUX)

## Special Thanks To

![IntelliJ IDEA logo](https://resources.jetbrains.com/storage/products/company/brand/logos/IntelliJ_IDEA_icon.png?size=100px)
![IntelliJ IDEA logo](https://resources.jetbrains.com/storage/products/company/brand/logos/IntelliJ_IDEA.png)
![Azul Java logo](https://www.azul.com/wp-content/themes/azul/dist/img/logo.svg)


[IntelliJ IDEA](https://www.jetbrains.com/idea/), Code editor for Java and other programming languages and programs.

[Azul Java](https://www.azul.com/) The world’s largest commercial provider of OpenJDK
