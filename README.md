[![](https://jitpack.io/v/marcinOz/TestCoroutineRule.svg)](https://jitpack.io/#marcinOz/TestCoroutineRule)

# TestCoroutineRule
TestCoroutineRule library to simplify testing of coroutines,
based on idea from Google IO talks: https://youtu.be/BOHK_w09pVA?t=2018.

<br />

```
@get:Rule
val testCoroutineRule = TestCoroutineRule()

@Test
fun `testing suspend function`() = testCoroutineRule.runBlockingTest {
    val result = someSuspendFunction()
    assertEquals(result, 44)
}
```

<br />

Step 1. Add the JitPack repository to your build file <br />
Add it in your root build.gradle at the end of repositories:
```
allprojects {
  repositories {
    ...
    maven { url 'https://jitpack.io' }
  }
}
  ```
<br />

Step 2. Add the dependency (in build.gradle under app)

```
dependencies {
  testImplementation 'com.github.marcinOz:TestCoroutineRule:1.0.1'
}
```
