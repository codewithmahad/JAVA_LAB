<h1 id="java_lab">
  <a href="https://dev.java/"><img src="assets/logos/java.svg" align="right" width="88" alt="Java coffee-cup mark."></a>
  JAVA_LAB
</h1>

**Java concepts, runnable experiments, and the things I want to remember.**

<sub>Core Java · Language experiments · JVM understanding · Revision</sub>

I keep this Java-only workspace alongside my **Java/Spring Boot backend projects**. It's where I want to work through language questions in small programs, save the results, and leave enough context to understand them months later. The code, corrections, and Git history will keep a record of that practice.

**Starting point:** [Maven project configured for Java 25](pom.xml). Java source files and experiment notes are still to be added.

<p>
  <a href="#java-learning-map">Learning map</a> &nbsp;·&nbsp;
  <a href="#recorded-experiments">Experiments</a> &nbsp;·&nbsp;
  <a href="#working-setup">Working setup</a> &nbsp;·&nbsp;
  <a href="#revision-notes">Revision notes</a>
</p>

<h2 id="java-learning-map">Java learning map</h2>

The areas I want to study and revisit. **All six groups are planned.** Topic names will link to source files as I add experiments.

<details>
<summary><strong>01 · Language fundamentals and OOP</strong></summary>

- Types, operators, control flow, methods, arrays, and strings.
- Classes, constructors, access modifiers, encapsulation, and composition.
- Inheritance, interfaces, abstract classes, and polymorphism.
- Enums, records, immutability, and object identity versus equality.

</details>

<details>
<summary><strong>02 · Collections, generics, and exceptions</strong></summary>

- `List`, `Set`, `Map`, queues, iteration, and choosing a collection.
- `equals()`, `hashCode()`, ordering, `Comparable`, and `Comparator`.
- Generic types and methods, bounds, wildcards, and type erasure.
- Checked and unchecked exceptions, custom exceptions, and resource cleanup.

</details>

<details>
<summary><strong>03 · Functional Java and I/O</strong></summary>

- Lambdas, functional interfaces, and method references.
- Streams, collectors, `Optional`, and comparisons with ordinary loops.
- Byte and character streams, encodings, and file handling.
- `Path`, `Files`, NIO, serialization, and deserialization.

</details>

<details>
<summary><strong>04 · Concurrency</strong></summary>

- Threads, shared mutable state, race conditions, and visibility.
- Synchronization, locks, atomics, and concurrent collections.
- Executors, task cancellation, futures, and `CompletableFuture`.
- Virtual threads and the difference between concurrency and parallelism.

</details>

<details>
<summary><strong>05 · JVM and language internals</strong></summary>

- Source code, bytecode, class loading, and initialization.
- Stack frames, heap objects, references, and garbage collection.
- The Java Memory Model and happens-before relationships.
- Reflection, annotations, and inspecting bytecode with `javap`.

</details>

<details>
<summary><strong>06 · Modern Java and experiments</strong></summary>

- Switch expressions, pattern matching, and sealed types.
- Language changes across JDK versions, including preview features.
- Small API comparisons and experiments that test an assumption.
- Performance measurements with warmup, repeatable inputs, and JMH.

</details>

<h2 id="recorded-experiments">Recorded experiments</h2>

No Java experiments are committed yet. This section will become a short index of the examples worth returning to, each linked to its code and observed result.

<details>
<summary><strong>Questions for the first experiments · planned</strong></summary>

| Question to test | What I want to compare |
| :--- | :--- |
| When do `==` and `equals()` disagree? | Same reference, equal values, and separately created objects. |
| What if a `HashMap` key changes? | Lookup before and after changing state used by `equals()` and `hashCode()`. |
| When is a stream easier to read? | The same transformation as a loop and a stream, including empty input. |
| What breaks with shared mutable data? | An unprotected counter and a synchronized or atomic version. |
| How does resource cleanup behave? | `try-with-resources` on normal completion and when an exception is thrown. |

</details>

<h2 id="java-in-practice">Java in practice</h2>

My approach here is to start with a question, predict the result, and write the smallest program that can check it. Then change an input or assumption and explain the difference. When I get something wrong, I want to keep the correction beside the code.

<picture>
  <source media="(prefers-color-scheme: dark) and (max-width: 600px)" srcset="assets/readme/java-execution-mobile-dark.svg">
  <source media="(max-width: 600px)" srcset="assets/readme/java-execution-mobile-light.svg">
  <source media="(prefers-color-scheme: dark)" srcset="assets/readme/java-execution-dark.svg">
  <img src="assets/readme/java-execution-light.svg" width="100%" alt="Java execution overview: javac compiles .java source into .class bytecode; the java launcher starts the JVM to load and execute the program.">
</picture>

<sub>A simplified view of the explicit compile-and-run path. See the JDK 25 command references for <a href="https://docs.oracle.com/en/java/javase/25/docs/specs/man/javac.html">javac</a> and <a href="https://docs.oracle.com/en/java/javase/25/docs/specs/man/java.html">java</a>.</sub>

For each useful experiment, I'll keep the **question, JDK version, run command, expected result, actual result, and explanation** together. A later revision should let me rerun it and explain the behaviour without relying on the old comments.

<h2 id="working-setup">Working setup</h2>

**JDK 25 · Maven · IntelliJ IDEA · Git**

The [POM](pom.xml) sets both compiler source and target to **25**. JDK 25 is the baseline for this workspace; preview features are not enabled in the current configuration.

<details>
<summary><strong>Open and check the workspace</strong></summary>

```sh
git clone https://github.com/codewithmahad/JAVA_LAB.git
cd JAVA_LAB
java -version
javac -version
mvn -version
mvn compile
```

Check that Maven reports JDK 25 as well. There's no Maven Wrapper in this repository, so the terminal commands use a local Maven installation. In IntelliJ IDEA, open `pom.xml` as a project and select JDK 25 for the project and Maven runner.

At this stage, compilation has no Java source files to process.

</details>

<details>
<summary><strong>Run an entry once source is added</strong></summary>

I'll use Maven's [standard source layout](https://maven.apache.org/guides/introduction/introduction-to-the-standard-directory-layout.html): `src/main/java/` for examples and `src/test/java/` for tests where useful. Those directories aren't present yet; topic packages will be added with their first implementation.

For a compiled example with a `main` method, the command pattern is:

```sh
mvn compile
java -cp target/classes fully.qualified.ClassName
```

Replace `fully.qualified.ClassName` with the entry's actual package and class name. Each recorded experiment will include its exact command. IntelliJ's run action is another option once that entry exists.

</details>

<h2 id="revision-notes">Revision notes</h2>

The notes I want beside an experiment are the details I'd otherwise forget: which input exposed the mistake, why the first explanation was wrong, and what changed after the fix.

<details>
<summary><strong>Things Java taught me</strong></summary>

I'll add conclusions here as experiments are recorded, with a link back to the code that supports each one. Each note should preserve the original assumption, the result, and the edge case worth remembering.

</details>

<details>
<summary><strong>References I want within reach · Java 25</strong></summary>

- **API contracts:** [Java SE 25 API](https://docs.oracle.com/en/java/javase/25/docs/api/index.html).
- **Language rules:** [Java Language Specification](https://docs.oracle.com/javase/specs/jls/se25/html/index.html).
- **Runtime behaviour:** [Java Virtual Machine Specification](https://docs.oracle.com/javase/specs/jvms/se25/html/index.html).
- **Explanations and examples:** [Dev.java learning topics](https://dev.java/learn/).

</details>

<h2 id="beyond-java-lab">Beyond JAVA_LAB</h2>

Java is the language behind my backend direction. In [**DeployLatch**](https://github.com/codewithmahad/deploylatch), a Java service gives me something concrete to deploy, check, and recover on Linux.

The other labs hold the work around it: [**DSA_LAB**](https://github.com/codewithmahad/DSA_LAB) for problem solving, [**SQL_LAB**](https://github.com/codewithmahad/SQL_LAB) for queries and relational design, and [**LINUX_LAB**](https://github.com/codewithmahad/LINUX_LAB) for Linux and Bash practice.

<p align="center">
  <strong>Shaikh Mahad Ud Din</strong> · Java Backend Development<br>
  <sub><a href="https://github.com/codewithmahad">GitHub</a> &nbsp;·&nbsp; <a href="https://github.com/codewithmahad?tab=repositories">Projects</a> &nbsp;·&nbsp; <a href="assets/README.md">Artwork credits</a> &nbsp;·&nbsp; <a href="#java_lab">Back to top ↑</a></sub>
</p>
