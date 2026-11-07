# README artwork

Local artwork for the Java notebook: a compact title, the Java mark, an open, numbered compile-and-run sequence, and a row of lab links. The original artwork has light and dark versions; the execution diagram also has a vertical layout for narrow screens.

| File | Source and purpose |
| :--- | :--- |
| `logos/java.svg` | Java mark from [Devicon](https://github.com/devicons/devicon/blob/master/icons/java/java-original.svg), stored without modifications. Upstream blob: `051bf254ad782820627890ef2b0e06fbae63dc6e`. |
| `logos/java-site.svg` | The same mark with its colors adapted to the Java.com palette; the original geometry is retained. |
| `logos/postgresql.svg` | Unmodified PostgreSQL elephant from [SQL_LAB's header artwork](https://github.com/codewithmahad/SQL_LAB/blob/main/assets/logos/postgresql.svg), originally from [Devicon](https://github.com/devicons/devicon/blob/master/icons/postgresql/postgresql-original.svg). Source blob: `4656cb79adde771d6eb3bf58647f4e82e89e083b`. |
| `readme/java-title-*.svg` | Original title using Segoe UI Bold, converted to vector paths so it renders consistently without a font download. |
| `readme/java-execution*.svg` | Original execution sketch: source → class files → JVM, annotated with the lab's standard Maven source and output paths. |
| `readme/lab-notebook-*.svg` | Archived notebook illustration from an earlier README layout; it is no longer displayed in the root README. |
| `readme/lab-{dsa,sql,linux}-{light,dark}.svg` | Original 40-pixel lab buttons with solid pale backgrounds, topic artwork, and vertically centered Segoe UI Semibold labels converted to paths. |

The execution sketch follows the JDK 25 command references for [javac](https://docs.oracle.com/en/java/javase/25/docs/specs/man/javac.html) and [java](https://docs.oracle.com/en/java/javase/25/docs/specs/man/java.html), alongside Maven's [source layout](https://maven.apache.org/guides/introduction/introduction-to-the-standard-directory-layout.html) and [compiler output](https://maven.apache.org/plugins/maven-compiler-plugin/compile-mojo.html#outputDirectory). It describes the explicit compile-and-run path and is a conceptual reference, not evidence of a recorded experiment.

The closing section has a paragraph specific to the host repository, a row of links to the other three labs, a short practice-profile line, and the LeetCode, HackerRank, and Codolio buttons. The lab and profile buttons are 40 pixels high.

The lab buttons use one solid pale fill each: Java white, DSA amber, PostgreSQL blue, and Linux silver. Their Segoe UI Semibold labels are converted to paths and vertically centered by their actual glyph bounds. Icon and label groups are centered together. The paired light/dark filenames use the same solid palette so the links stay consistent in both themes.

- **Java:** the Devicon coffee-cup geometry, adapted to Java.com blue and orange.
- **DSA:** an original orange search-tree symbol.
- **SQL:** the original Devicon PostgreSQL elephant.
- **Linux:** unchanged **Tux, by Larry Ewing, created using The GIMP**. [Original artwork and reuse terms](http://isc.tamu.edu/~lewing/linux/) · [LINUX_LAB source notes](https://github.com/codewithmahad/LINUX_LAB/blob/main/assets/README.md#tux).

Devicon's MIT notice for the Java and PostgreSQL artwork is included in [logos/LICENSE-devicon.txt](logos/LICENSE-devicon.txt). The marks belong to their respective owners and identify the languages and tools used in the labs.

The Linux buttons embed **Tux, by Larry Ewing, created using The GIMP**, as an unchanged PNG from [LINUX_LAB's existing artwork](https://github.com/codewithmahad/LINUX_LAB/blob/main/assets/lessons/files-and-directories.svg). Credit and original reuse terms: [Larry Ewing's Linux artwork page](http://isc.tamu.edu/~lewing/linux/) and [LINUX_LAB's source notes](https://github.com/codewithmahad/LINUX_LAB/blob/main/assets/README.md#tux).

The palette comes from [Java.com](https://www.java.com/en/): blue `#3A75B0` is its primary/header color in [jcom_redwood.css](https://www.java.com/jcom/assets/jcom_redwood.css); orange `#F29111` is the homepage heading accent. Neutral text and hairline dividers adapt to GitHub's light and dark backgrounds. The workflow has no filled panels.

The original SVGs include accessible titles and descriptions. They contain no scripts, embedded fonts, or external resources.


The profile buttons reuse [my profile’s contact artwork](https://github.com/codewithmahad/codewithmahad/tree/main/assets/profile/contact), with the logos and lettering enlarged within a 40-pixel frame to match the lab buttons. Their original platform colors and lettering are retained.


The connected-labs title is a normal section heading. Lab buttons use black text on light fills; Java has a white background and a larger coffee-cup mark, SQL uses a stronger blue, and DSA has black branches and secondary-node outlines around orange centers. The social-button content is enlarged by 15% inside the same 40-pixel height, with wider backgrounds to preserve its proportions.
