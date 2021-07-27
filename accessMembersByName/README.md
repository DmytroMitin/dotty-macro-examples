# Access An Arbitrary Field or a Method of A Given Expression by Its String Name

We first access a single field in that manner. Then we call a method knowing only its String name,
and pass the value of the field in question to that method. Then we discuss the case when a method
has generic parameters. The generic parameters can be either known or unknown on macro call time. In
case they are unknown, we may still be able to infer them manually from the arguments to the method
call. We discuss how to call the method using such a manual inference.

The techniques used here are:

- Quotes Reflection for typed AST tree manipulation
- Unlifting a literal from an expression to a value
- Learning which exactly trees to construct via `println(('{ ... }).asTerm)` technique
- Working with the Scala 3 Reflection API, learning how exactly to construct the AST nodes
- Widening a reflect type to prevent it from been to narrow
