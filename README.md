<h1 id="java_lab">
  <a href="https://dev.java/"><img src="assets/logos/java.svg" align="right" width="14%" alt="Java coffee-cup mark."></a>
  <picture>
    <source media="(prefers-color-scheme: dark)" srcset="assets/readme/java-title-dark.svg">
    <img src="assets/readme/java-title-light.svg" width="70%" height="56" align="texttop" alt="JAVA_LAB">
  </picture>
</h1>

**Java concepts, runnable experiments, and the things I want to remember.**

I keep this notebook for independent Java practice alongside my **Spring Boot backend work**. Small experiments, tests, and short notes help me understand the language behaviour behind application code.

<details>
<summary><strong>About this lab</strong></summary>

A framework can hide a language question behind configuration and application code. Here I can isolate it: two object references, one collection, a decimal calculation, or a shared counter.

I study Java and DSA alongside application development, usually through focused weekend sessions. This notebook keeps the language work easy to pick up again, with Git preserving the attempts and corrections.

</details>

<p>
  <a href="#current-focus">Learning focus</a> &nbsp;·&nbsp;
  <a href="#java-learning-map">Learning map</a> &nbsp;·&nbsp;
  <a href="#recorded-experiments">Experiments &amp; revision</a> &nbsp;·&nbsp;
  <a href="#working-setup">Working with the lab</a>
</p>

<h2 id="current-focus">Learning focus</h2>

**Starting point:** [Java 25 / Maven configuration](pom.xml). The roadmap is planned; Java examples and tests have not been added yet.

**Next question:** where do `==` and `equals()` disagree? Compare shared references, equal values, and separately created objects.

<h2 id="java-learning-map">Java learning map</h2>

Everyday language and APIs come first, followed by backend correctness and runtime questions. **Core**, **Next**, and **Deep dive** keep those priorities visible inside each group. Topic links will identify recorded code, tests, or notes.

<details>
<summary><strong>01 · Language fundamentals and OOP</strong></summary>

**Core**

- Types, control flow, methods, arrays, strings, and reference versus value equality.
- Classes, constructors, interfaces, inheritance, polymorphism, and composition.
- Checking behaviour with JUnit assertions, boundary cases, and expected exceptions.

**Next:** enums, records, immutable objects, and defensive copying.

</details>

<details>
<summary><strong>02 · Collections, generics, and exceptions</strong></summary>

**Core**

- Choosing a `List`, `Set`, `Map`, or queue; iteration and collection behaviour.
- `equals()`, `hashCode()`, generic types, bounds, and wildcards.
- Checked and unchecked exceptions, propagation, wrapping, and useful error context.

**Next:** mutable keys, ordering, `Comparable`, and `Comparator`.

</details>

<details>
<summary><strong>03 · Functional Java and platform APIs</strong></summary>

**Core:** lambdas, method references, streams, collectors, `Optional`, and comparisons with loops.

**Next**

- File I/O, encodings, `Path`, `Files`, and `try-with-resources`.
- `java.time` — instants, dates, durations, time zones, and a controllable `Clock`.
- `BigDecimal` — precision, scale, rounding, and comparisons in money calculations.
- Small HTTP client and JDBC exercises, independent of a framework.

</details>

<details>
<summary><strong>04 · Concurrency and shared state</strong></summary>

**Next**

- Threads, race conditions, visibility, synchronization, and atomic operations.
- Executors, futures, cancellation, and concurrent collections.

**Deep dive:** `CompletableFuture`, virtual threads, and comparisons between concurrency approaches.

</details>

<details>
<summary><strong>05 · JVM, diagnostics, and internals</strong></summary>

**Next**

- Source and bytecode, stack frames, heap objects, references, and garbage collection basics.
- Reading stack traces and inspecting a running program with JDK tools.

<picture>
  <source media="(prefers-color-scheme: dark) and (max-width: 600px)" srcset="assets/readme/java-execution-mobile-dark.svg">
  <source media="(max-width: 600px)" srcset="assets/readme/java-execution-mobile-light.svg">
  <source media="(prefers-color-scheme: dark)" srcset="assets/readme/java-execution-dark.svg">
  <img src="assets/readme/java-execution-light.svg" width="100%" alt="Java execution overview: javac compiles .java source into .class bytecode; the java launcher starts the JVM to load and execute the program.">
</picture>

<sub>The explicit compile-and-run path. JDK 25 references: <a href="https://docs.oracle.com/en/java/javase/25/docs/specs/man/javac.html">javac</a> · <a href="https://docs.oracle.com/en/java/javase/25/docs/specs/man/java.html">java</a>.</sub>

**Deep dive**

- Class loading, initialization, reflection, annotations, and type erasure.
- The Java Memory Model, happens-before relationships, and GC diagnostics.

</details>

<details>
<summary><strong>06 · Modern Java and measured experiments</strong></summary>

**Next**

- Switch expressions, pattern matching, and sealed types in small examples.
- JDK version comparisons and the requirements of preview features.

**Deep dive**

- Inspecting generated bytecode with `javap` and comparing implementations.
- Performance experiments with JMH, warmup, repeatable inputs, and stated limits.

</details>

<h2 id="recorded-experiments"><a id="java-in-practice"></a><a id="revision-notes"></a>Experiments &amp; revision</h2>

Start with a question and predict the result. Write the smallest useful example, check normal and edge cases, then explain what happened. On the next visit, recall the explanation before opening the notes and try a variation.

Keep the **question, JDK version, run command, observed result, and correction** beside the code. A short comment can capture a simple exercise; a test makes behaviour easier to check again. The most useful discoveries become **Things Java taught me**, linked to the example that supports them.

<details>
<summary><strong>Questions to work through</strong></summary>

| Question | Comparison to make |
| :--- | :--- |
| What if a `HashMap` key changes? | Lookup before and after changing equality-related state. |
| Can equal decimal values compare differently? | `BigDecimal.equals()` and `compareTo()`, with different scales. |
| When does a resource close? | Normal completion, an exception, and cleanup that also fails. |

</details>

<h2 id="working-setup">Working with the lab</h2>

**JDK 25 · Maven · IntelliJ IDEA · Git**

The [POM](pom.xml) sets compiler source and target to **25**, with no preview features enabled.

<details>
<summary><strong>Open, check, and run</strong></summary>

```sh
git clone https://github.com/codewithmahad/JAVA_LAB.git
cd JAVA_LAB
java -version
javac -version
mvn -version
mvn compile
```

Use JDK 25 for both the project and Maven. There's no Maven Wrapper, so terminal commands need a local Maven installation. In IntelliJ IDEA, open `pom.xml` and select JDK 25 for the project and Maven runner.

Use `src/main/java/` for examples and `src/test/java/` for tests. JUnit needs to be added to the POM with the first test.

For an entry with a `main` method, the command pattern is:

```sh
mvn compile
java -cp target/classes fully.qualified.ClassName
```

Replace `fully.qualified.ClassName` with the entry's actual package and class.

</details>

<details>
<summary><strong>References within reach</strong></summary>

- **API contracts:** [Java SE 25 API](https://docs.oracle.com/en/java/javase/25/docs/api/index.html) · [Dates and time](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/time/package-summary.html) · [BigDecimal](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/math/BigDecimal.html).
- **Language and runtime:** [Java Language Specification](https://docs.oracle.com/javase/specs/jls/se25/html/index.html) · [JVM Specification](https://docs.oracle.com/javase/specs/jvms/se25/html/index.html).
- **Worked explanations:** [Dev.java](https://dev.java/learn/). **Testing reference:** [JUnit User Guide](https://docs.junit.org/current/user-guide/).

</details>

<h2 id="beyond-java-lab">Beyond JAVA_LAB</h2>

Application work gives these language questions a larger setting. In [**DeployLatch**](https://github.com/codewithmahad/deploylatch), a Java service is what I deploy, check, and recover on Linux.

Alongside this notebook: [**DSA_LAB**](https://github.com/codewithmahad/DSA_LAB) for problem solving · [**SQL_LAB**](https://github.com/codewithmahad/SQL_LAB) for queries and relational design · [**LINUX_LAB**](https://github.com/codewithmahad/LINUX_LAB) for Linux and Bash.

<p align="center">
  <strong>Shaikh Mahad Ud Din</strong> · Java Backend Development<br>
  <sub><a href="https://github.com/codewithmahad">GitHub</a> &nbsp;·&nbsp; <a href="https://github.com/codewithmahad?tab=repositories">Projects</a> &nbsp;·&nbsp; <a href="assets/README.md">Artwork credits</a> &nbsp;·&nbsp; <a href="#java_lab">Back to top ↑</a></sub>
</p>
