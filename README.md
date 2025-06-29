# Kotlin study notes

See: https://kotlinlang.org/docs/basic-syntax.html

Seek immutability as much as possible.

## Fields

As best practice, fields should be `val`, change to `var` as needed.

## toString

```kotlin
    override fun toString(): String {
        return "Jogo:\n" +
                "titulo: $titulo \n" +
                "capa: $capa \n" +
                "descricao:$descricao \n"
    }
```