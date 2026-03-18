## 📊 Java Program: Datatypes Size Check

This program prints the **size (in bytes)** of all primitive data types in Java and explains how data is stored using **bits, combinations, and ranges**.

---

## 📚 Concepts Covered

### 🔹 1. Bit & Byte

* 1 bit = 0 or 1
* 1 byte = 8 bits
* Computers understand only binary (0,1)

---

### 🔹 2. Binary System

* Binary = Base 2 number system
* Example:

  * 5 = 101
  * Stored in 8 bits as: 00000101

---

### 🔹 3. Total Combinations (IMPORTANT)

Formula:
**Total values = 2ⁿ**

Example:

* 8 bits → 2⁸ = 256 combinations

---

### 🔹 4. Range Formula (VERY IMPORTANT)

**Range = -2⁽ⁿ⁻¹⁾ to +2⁽ⁿ⁻¹⁾ - 1**

Example:

* byte (8 bits)
  → Range = -128 to 127

---

### 🔹 5. Java Primitive Data Types

| Data Type | Size          | Bits    | Combinations  | Range              |
| --------- | ------------- | ------- | ------------- | ------------------ |
| byte      | 1 byte        | 8 bits  | 2⁸ = 256      | -128 to 127        |
| short     | 2 bytes       | 16 bits | 2¹⁶ = 65,536  | -32,768 to 32,767  |
| int       | 4 bytes       | 32 bits | 2³² values    | -2³¹ to 2³¹ - 1    |
| long      | 8 bytes       | 64 bits | 2⁶⁴ values    | -2⁶³ to 2⁶³ - 1    |
| float     | 4 bytes       | 32 bits | Decimal type  | Approx range       |
| double    | 8 bytes       | 64 bits | Decimal type  | High precision     |
| char      | 2 bytes       | 16 bits | 65,536 values | Unicode characters |
| boolean   | JVM dependent | -       | true/false    | -                  |

---

### 🔹 6. Signed Numbers

* Java supports **positive and negative values**
* Negative numbers are stored using **2’s complement**

---

### 🔹 7. 2’s Complement (Important Concept)

Steps:

1. Convert number to binary
2. Flip bits (1’s complement)
3. Add 1

Example:
3 = 00000011
→ 11111100
+1 = 11111101 (represents -3)

---

## 🧠 One-Line Revision

* Computer = Binary (0,1)
* Total values = 2ⁿ
* Range = -2⁽ⁿ⁻¹⁾ to 2⁽ⁿ⁻¹⁾ - 1
* Negative numbers = 2’s complement

---

## 📌 Output Example

Byte size (in bytes): 1
Short size (in bytes): 2
Integer size (in bytes): 4
Long size (in bytes): 8
Float size (in bytes): 4
Double size (in bytes): 8
Character size (in bytes): 2

---

⭐ This program helps in building a strong foundation in **data representation and memory concepts in Java**.
