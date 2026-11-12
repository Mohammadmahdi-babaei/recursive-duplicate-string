# Recursive Duplicate String Validator

![Java](https://img.shields.io/badge/Java-ED8B00?style=flat&logo=openjdk&logoColor=white)
![Python](https://img.shields.io/badge/Python-3776AB?style=flat&logo=python&logoColor=white)

A recursive implementation in **Java** and **Python** to validate whether a given string follows the Duplicate String structural pattern.

## Algorithm Logic

A string `s` is validated as a Duplicate string if it satisfies all of the following criteria:
1. **Base Case:** Its length is `0` (an empty string is valid).
2. **Symmetry:** It is formed by repeating a substring twice (`s = s' + s'`), requiring an even length.
3. **Recursive Reduction:** After removing the first character of the leading substring `s'`, the remaining sequence must recursively satisfy these exact same conditions.

## Complexity Analysis

* **Recurrence Relation:** `T(n) = T(n/2 - 1) + O(n)`
* **Time Complexity:** `O(n)`
  String splitting and character comparison take linear time proportional to the current length at each recursive depth.
* **Space Complexity:** `O(n)`
  Determined by the maximum depth of the recursive call stack and substring allocation.

## Prerequisites

* **Java:** JDK 8 or higher
* **Python:** Python 3.14+
* **Environment:** Tested and executed on Windows (Visual Studio Code).

## Usage

### Java Execution
```bash
javac DuplicateString.java
java DuplicateString
```

### Python Execution
```bash
python duplicate_string.py
```
