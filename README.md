# Personal finance tracker

A desktop application for personal finance tracking. The app will allow users to track income, expenses, and budgets, and provide visual reports for better financial insight.

## Prerequisites

Make sure you have the following installed on your machine:

-   Java Development Kit (JDK) 17
-   Apache Maven
-   Python 3
-   Git

## Clone the Repository

```sh
git clone https://github.com/your-username/personal-finance-tracker.git
cd personal-finance-tracker
```

## JavaFX Setup

JavaFX is required for the UI components of this project. The necessary dependencies are already included in the `pom.xml` file.

## Checkstyle Setup

Checkstyle is used to ensure that the code adheres to the coding standards. The configuration file is located at [linter/sun_checks.xml](linter/sun_checks.xml).

### Running Checkstyle

You can download the Checkstyle JAR file from the [official website](https://checkstyle.org/) into the linter folder. The version used in this project is 10.20.0.

Checkstyle can be run using the command:

```sh
java -jar linter/checkstyle-10.20.0.jar -c linter/sun_checks.xml src/main/java
```

Checkstyle is also automatically run when you commit code using the pre-commit hooks.

## Google Java Formatter

Google Java Formatter is used to format the code according to Google's Java style guide.

### Install Google Java Formatter

You can install the formatter using Maven:

```sh
mvn com.coveo:fmt-maven-plugin:format
```

## Pre-commit Hooks

Pre-commit hooks are used to run checks before committing code. This project uses `pre-commit` to manage these hooks.

### Install Pre-commit

Install the pre-commit package:

```sh
python3 -m venv .venv
source .venv/bin/activate
python3 -m pip install -r requirements.txt
pre-commit install
```

## Additional Resources

-   [JavaFX Documentation](https://openjfx.io/)
-   [Checkstyle Documentation](https://checkstyle.org/)
-   [Google Java Style Guide](https://google.github.io/styleguide/javaguide.html)
-   [Pre-commit Documentation](https://pre-commit.com/)

Happy coding!
