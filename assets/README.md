# README artwork

Local artwork for the Java notebook: a compact title, the Java mark, an open, numbered compile-and-run sequence, and a closing illustration with small lab links. The original artwork has light and dark versions; the execution diagram also has a vertical layout for narrow screens.

| File | Source and purpose |
| :--- | :--- |
| `logos/java.svg` | Java mark from [Devicon](https://github.com/devicons/devicon/blob/master/icons/java/java-original.svg), stored without modifications. Upstream blob: `051bf254ad782820627890ef2b0e06fbae63dc6e`. |
| `logos/java-site.svg` | The same mark with its colors adapted to the Java.com palette; the original geometry is retained. |
| `logos/postgresql.svg` | Unmodified PostgreSQL elephant from [SQL_LAB's header artwork](https://github.com/codewithmahad/SQL_LAB/blob/main/assets/logos/postgresql.svg), originally from [Devicon](https://github.com/devicons/devicon/blob/master/icons/postgresql/postgresql-original.svg). Source blob: `4656cb79adde771d6eb3bf58647f4e82e89e083b`. |
| `readme/java-title-*.svg` | Original title using Segoe UI Bold, converted to vector paths so it renders consistently without a font download. |
| `readme/java-execution*.svg` | Original execution sketch: source → class files → JVM, annotated with the lab's standard Maven source and output paths. |
| `readme/lab-notebook-*.svg` | Original open-notebook illustration for the closing section: code, revision notes, a bookmark, and a pencil. Its shape can be reused across learning labs, with accents adapted to each lab. |
| `readme/lab-{dsa,sql,linux}-{light,dark}.svg` | Inline links inspired by my profile's typing button. Each follows its destination README: DSA's orange tree and Consolas lettering, SQL's PostgreSQL elephant and blue, and Linux's Tux with charcoal-and-silver lettering. Labels use the corresponding system fonts converted to paths. |

The execution sketch follows the JDK 25 command references for [javac](https://docs.oracle.com/en/java/javase/25/docs/specs/man/javac.html) and [java](https://docs.oracle.com/en/java/javase/25/docs/specs/man/java.html), alongside Maven's [source layout](https://maven.apache.org/guides/introduction/introduction-to-the-standard-directory-layout.html) and [compiler output](https://maven.apache.org/plugins/maven-compiler-plugin/compile-mojo.html#outputDirectory). It describes the explicit compile-and-run path and is a conceptual reference, not evidence of a recorded experiment.

The connected-labs section shares its heading and 20-pixel inline link treatment with the other labs. Each paragraph describes its own repository and links only to the other three; the notebook stays specific to JAVA_LAB.

Devicon's MIT notice for the Java and PostgreSQL artwork is included in [logos/LICENSE-devicon.txt](logos/LICENSE-devicon.txt). The marks belong to their respective owners and identify the languages and tools used in the labs.

The Linux buttons embed **Tux, by Larry Ewing, created using The GIMP**, as an unchanged PNG from [LINUX_LAB's existing artwork](https://github.com/codewithmahad/LINUX_LAB/blob/main/assets/lessons/files-and-directories.svg). Credit and original reuse terms: [Larry Ewing's Linux artwork page](http://isc.tamu.edu/~lewing/linux/) and [LINUX_LAB's source notes](https://github.com/codewithmahad/LINUX_LAB/blob/main/assets/README.md#tux).

The palette comes from [Java.com](https://www.java.com/en/): blue `#3A75B0` is its primary/header color in [jcom_redwood.css](https://www.java.com/jcom/assets/jcom_redwood.css); orange `#F29111` is the homepage heading accent. Neutral text and hairline dividers adapt to GitHub's light and dark backgrounds. The workflow has no filled panels.

The original SVGs include accessible titles and descriptions. They contain no scripts, embedded fonts, or external resources.


The compact profile links are unchanged SVG copies of [DSA_LAB's LeetCode, HackerRank, and Codolio artwork](https://github.com/codewithmahad/DSA_LAB/tree/main/assets/readme), originally reused from [my profile's contact buttons](https://github.com/codewithmahad/codewithmahad/tree/main/assets/profile/contact). The platform graphics and lettering retain their original attribution.
