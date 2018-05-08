# oca8-study
oca8-study

---

Before try answer the output for a code snippet, check whether;
* does the code compile?
*** if there're no choices of the form "Code does not compile", then you can be reasonably assured all the lines of code will compile, and you do not need to spend time checking syntax.
*** if the answer choices do include some answers of the form "Does not compile due to line 5", you should immediately focus on those lines and determine whether they compile, in case it does, eliminate the choice and go to the next

Reviewing Common Compiler Issues (whether the code compiles)
* keep an eye out for all reserved words
* verify brackets and parentheses are being used correctly
* verify "new" is used appropriately for creating objects
* ignore all line indentation especially with if-then statements that do not use brackets
* make sure operators use compatible data types, such as logical complement operator (!) only applied to boolean values, and arithmetic operators (+,-,++,--) only applied to numeric values
* for any numeric operators, check for automatic numeric promotion and order or operation when evaluating and expression
* verify switch statements use acceptable data types
* remember == is not the same as equals()
* String values are immutable
* non-void methods must return a value that matches or is a subclass of the return type of the method
* if two classes are involved, make sure access modifiers allow proper access of variables and methods
* nonstatic methods and variables require an object instance to access
* if a class is missing a default no-argument constructor or the provided constructors do not explicitly call super(), assume the compiler will automatically insert them
* make sure abstract methods do not define an implementation, and likewise concrete methods always define an implementation
* you implement an interface and extend a class
* a class can be cast to a reference of any superclass it inherits from or interface it implements [chapter 5]
* checked exceptions must be caught; unchecked exceptions may be caught but do not need to be
* "try" blocks require a "catch" and/or "finally" block for the OCA exam

Acceptable data types in Switch statements
* try memorize these information before the exam and write it down as soon as the exam starts
