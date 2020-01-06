[![License LGPLv3][LGPLv3 badge]][LGPLv3]
[![License ASL 2.0][ASL 2.0 badge]][ASL 2.0]
[![Build Status][Travis badge]][Travis]
[![Maven Central][Maven Central badge]][Maven]

## Read me first

This project, as of version 1.0, is licensed under both LGPLv3 and ASL 2.0. See
file LICENSE for more details. Versions 1.0 and lower are licensed under LGPLv3
only.

**Note the "L" in "LGPL". LGPL AND GPL ARE QUITE DIFFERENT!**

**NOTE**: this project uses [Gradle](http://gradle.org) as a build system. See the `BUILD.md` file
for more details.

## What this is

This is a lightweight, extensible message bundle API which you can use as a replacement to Java's
`ResourceBundle`. It is also able to load legacy `ResourceBundle`s.

Among features that this library offers which `ResourceBundle` doesn't are:

* UTF-8 support,
* `printf()`-like format for messages (in addition to the antique `MessageFormat`),
* builtin assertions,
* error resistant.

See below for more.

## Versions

The current version is **1.2**. Javadoc [here](https://java-json-tools.github.io/msg-simple/index.html).

See [here](https://github.com/fge/msg-simple/wiki/Examples) for sample API usage.

## Downloads and Maven artifact

Versions before 1.2 are available at `groupId` `com.github.fge`.

**OBSOLETE** You can download the jar directly on [Bintray](https://bintray.com/fge/maven/msg-simple).

For Gradle:

```gradle
dependencies {
    compile(group: "com.github.java-json-tools", name: "msg-simple", version: "yourVersionHere");
}
```

For Maven:

```xml
<dependency>
    <groupId>com.github.java-json-tools</groupId>
    <artifactId>msg-simple</artifactId>
    <version>your-version-here</version>
</dependency>
```

## Features and roadmap

This library currently has the following features:

* static or load-on-demand message sources, with configurable expiry;
* property files read using UTF-8, ISO-8859-1 or any other encoding of your choice;
* `printf()`-like message support in addition to `MessageFormat` support;
* i18n/locale support;
* stackable message sources;
* builtin preconditions in bundles (`checkNotNull()`, `checkArgument()`, plus their `printf()`/`MessageFormat` equivalents);

The roadmap for future versions can be found [here](https://github.com/fge/msg-simple/wiki/Roadmap). Feature requests are of course
welcome!

[LGPLv3 badge]: https://img.shields.io/:license-LGPLv3-blue.svg
[LGPLv3]: http://www.gnu.org/licenses/lgpl-3.0.html
[ASL 2.0 badge]: https://img.shields.io/:license-Apache%202.0-blue.svg
[ASL 2.0]: http://www.apache.org/licenses/LICENSE-2.0.html
[Travis Badge]: https://api.travis-ci.org/java-json-tools/msg-simple.svg?branch=master
[Travis]: https://travis-ci.org/java-json-tools/msg-simple
[Maven Central badge]: https://img.shields.io/maven-central/v/com.github.java-json-tools/msg-simple.svg
[Maven]: https://search.maven.org/artifact/com.github.java-json-tools/msg-simple

