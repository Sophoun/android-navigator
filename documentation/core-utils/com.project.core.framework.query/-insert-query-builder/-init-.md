[core-utils](../../index.md) / [com.sophoun.android.framework.query](../index.md) / [InsertQueryBuilder](index.md) / [&lt;init&gt;](./-init-.md)

# &lt;init&gt;

`InsertQueryBuilder(contentResolver: <ERROR CLASS>)`

This class can use for insert a list of data to
android database using ContentProvider

Sample usage:

```
InsertQueryBuilder<Album>(context?.contentResolver!!)
     .uri(MediaStore.Audio.Playlists.EXTERNAL_CONTENT_URI)
     .mapper {
     arrayOf("p1", "p2", "p3", "p4", "p5")
         .map {
             ContentValues().apply { put(MediaStore.Audio.Playlists.NAME, it) }
         }
     }.onCompleted {
         DLog.i("Result", "Completed")
     }
     .onResult {
         DLog.i("Result", it.toString())
     }.onError {
         DLog.e("Result", it.toString())
     }.execute()
```

