[core-utils](../../index.md) / [com.sophoun.android.core.utils](../index.md) / [SingleLiveEvent](index.md) / [&lt;init&gt;](./-init-.md)

# &lt;init&gt;

`SingleLiveEvent()`

This avoids a common problem with events: on configuration change (like rotation) an update
can be emitted if the observer is active. This LiveData only calls the observable if there's an
explicit call to `postValue()` or `setValue()`.

