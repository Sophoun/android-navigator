[core-utils](../../index.md) / [com.sophoun.android.framework.query](../index.md) / [UpdateQueryBuilder](index.md) / [&lt;init&gt;](./-init-.md)

# &lt;init&gt;

`UpdateQueryBuilder(contentResolver: <ERROR CLASS>)`

This class can use for update data on
android database using ContentProvider

Sample usage:

```
UpdateQueryBuilder<Album>(context?.contentResolver!!)
     .uri(MediaStore.Audio.Playlists.EXTERNAL_CONTENT_URI)
     .mapper {
         ContentValues().apply {
             put(MediaStore.Audio.Playlists.NAME, "NEW NAME")
         }
     }.selection("${MediaStore.Audio.Playlists._ID} = ?")
     .selectionArgs(id.toString())
     .onResult {
         DLog.i("Result", it.toString())
     }.onError {
         DLog.e("Result", it.message!!)
     }.onCompleted {
         DLog.i("Result", "Completed")
     }.execute()
```

