[core-utils](../../index.md) / [com.sophoun.android.framework.query](../index.md) / [DeleteQueryBuilder](index.md) / [&lt;init&gt;](./-init-.md)

# &lt;init&gt;

`DeleteQueryBuilder(contentResolver: <ERROR CLASS>)`

This class can use for delete data from android using ContentProvider

Sample usage:

```
DeleteQueryBuilder(context?.contentResolver!!)
     .uri(MediaStore.Audio.Playlists.EXTERNAL_CONTENT_URI)
     .selection("${MediaStore.Audio.Playlists._ID} = ?")
     .selectionArgs(id.toString())
     .onResult {
         DLog.i("Result", it.toString())
     }.onError {
         DLog.e("Result", it.message!!)
     }.onCompleted {
         DLog.i("Result", "Completed")
     }.execute()
```

