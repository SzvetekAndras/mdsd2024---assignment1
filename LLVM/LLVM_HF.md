
## A kapott kódrészlet a következő:

```
define void @uselessFunction(){
    ret void
}

define void @myFunction(i1 %cond) {
entry:
  br i1 %cond, label %then, label %exit

then:
  ret void

unr:
  call void @uselessFunction()  
  ret void

exit:
  ret void
}
```

Ezt az alábbi linken elérhető környezetben próbáltam ki: https://godbolt.org/

A keresett pass a simplifycfg. Az opt paramétere ez alapján -p='simplifycfg'

## A bemenet esetén az optimalizált kimenet:

```

define void @uselessFunction() {
  ret void
}

define void @myFunction(i1 %cond) {
  ret void
}

```
## Az indoklás:

A választott pass pedig az simplifycfg, mivel ez képes leegyszerűsíteni a kódot, a felesleges függvény hívásokat, műveleteket kitörölni. Mivel a @uselessFunction semmit sem csinál, ezért meghívni is értelmetlen, de így a @myFunction sem csinál semmit csipán, így ezt is leegyszerűséthetjük.

