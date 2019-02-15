### 概述
Atomic 是使用CAS （compare and swap） 算法来支持原子（同步）操作。

CAS是CPU架构的支持 ， 不是JAVA创造的。

不同的CPU架构有不同的实现方式。JAVA只调用平台相关的处理器CAS指令。




### 来自包 java.util.concurrent.atomic
```
AtomicBoolean 布尔值
AtomicInteger 整数值
AtomicIntegerArray 整数数组值
AtomicIntegerFieldUpdater 
AtomicLong 长整数值
AtomicLongArray 长整数数组值
AtomicLongFieldUpdater
AtomicMarkableReference
AtomicReference
AtomicReferenceArray
AtomicReferenceFieldUpdater
AtomicStampedReference
DoubleAccumulator
DoubleAdder
LongAccumulator
LongAdder
Striped64
```
AtomicInteger
