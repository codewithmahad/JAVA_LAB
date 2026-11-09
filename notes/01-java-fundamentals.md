# Lesson 01: Java fundamentals

Examples: [HelloWorld.java](../src/main/java/com/codewithmahad/javalab/fundamentals/lesson01/HelloWorld.java) and [DataTypes.java](../src/main/java/com/codewithmahad/javalab/fundamentals/lesson01/DataTypes.java).

## Entry point, class, and package

These programs start at `public static void main(String[] args)`. `public` makes the method accessible to the launcher, `static` lets it run without creating an object, and `void` means it returns no value. `args` holds command-line arguments as an array of strings.

Each example is a class. A public class named `HelloWorld` belongs in `HelloWorld.java`. Its package, `com.codewithmahad.javalab.fundamentals.lesson01`, gives it a namespace and matches the directory path beneath `src/main/java/`.

`printStudyTip()` is a small static method in `HelloWorld`. It belongs to the class, so `main` can call it directly without `new HelloWorld()`. `private` keeps this helper inside its class.

## Console output

| Method | Behaviour |
| --- | --- |
| `System.out.print(...)` | Writes text without ending the line. |
| `System.out.println(...)` | Writes text and ends the line. |
| `System.out.printf(...)` | Formats values using placeholders; add `%n` to end the line. |

Useful placeholders: `%s` for text, `%d` for an integer, and `%.1f` for a floating-point value with one decimal place. Escape sequences inside strings include `\"` (quote), `\\` (backslash), `\t` (tab), and `\n` (newline). Prefer `%n` for a platform-specific newline in `printf`.

## Types and variables

Java has eight primitive types. Integer types other than `char` are signed.

| Type | Size / meaning | Example |
| --- | --- | --- |
| `byte` | 8-bit integer | `byte exercises = 8;` |
| `short` | 16-bit integer | `short studyMinutes = 120;` |
| `int` | 32-bit integer | `int completedLessons = 1;` |
| `long` | 64-bit integer | `long population = 8_000_000_000L;` |
| `float` | 32-bit floating point | `float temperature = 24.5F;` |
| `double` | 64-bit floating point | `double pi = 3.141592653589793;` |
| `char` | Unsigned 16-bit UTF-16 code unit | `char grade = 'A';` |
| `boolean` | `true` or `false`; Java specifies no storage size | `boolean isLearning = true;` |

`String language = "Java";` declares a reference to an immutable text object. `String` is a class, not a primitive; single quotes denote a `char`, and double quotes denote a string. One `char` does not necessarily represent a complete Unicode character.

`int completedLessons;` declares a local variable; `completedLessons = 1;` assigns its value. Local variables must be assigned before use. `int total = completedLessons + 3;` declares and initializes a variable using addition. With integer operands, `7 / 2` produces `3`; `7.0 / 2` produces `3.5`.

## Coming from C++

- These examples put `main` inside a class. Java's `main` returns `void`, unlike C++'s `int main()`.
- Java packages group classes; there are no C++-style `#include` directives or separate header files for these examples.
- Java defines the numeric sizes above; C++ integer sizes depend on the implementation within standard limits. Java's `char` is a UTF-16 code unit, unlike C++'s byte-sized `char`.
- `System.out` handles output instead of `std::cout`. Java also has `printf`, with Java's formatting rules.
- Compare string contents with `equals()`. For Java objects, `==` compares reference identity; C++ `std::string` uses `==` for content comparison.
- Java manages object memory through garbage collection. It does not use C++'s `delete` or deterministic object destructors; resources such as files still need explicit closing.

## Run from the repository root

Use Maven with JDK 25; `mvn -version` shows which JDK Maven is using.

```powershell
mvn compile
java -cp target/classes com.codewithmahad.javalab.fundamentals.lesson01.HelloWorld
java -cp target/classes com.codewithmahad.javalab.fundamentals.lesson01.DataTypes
```

This checkout has no Maven Wrapper. If `mvn` is not on PATH, invoke an installed Maven's `bin/mvn.cmd` by its full path. Keep local machine paths out of `pom.xml`.

## Adding future lessons

Keep independently runnable examples under `src/main/java/com/codewithmahad/javalab/<topic>/lessonNN/`, with the matching package declaration. Add tests under `src/test/java/com/codewithmahad/javalab/` when a lesson needs repeatable automated checks; create those directories with the first test rather than adding empty placeholders.

Topic packages: `fundamentals`, `controlflow`, `methods`, `arrays`, `strings`, `oop`, `exceptions`, `collections`, `generics`, `functional`, `streams`, `concurrency`, `io`, and `jvm`. Only `fundamentals.lesson01` is needed now. Add later packages as you study them, and keep brief notes, predictions, and observed results alongside each lesson's explanation.
