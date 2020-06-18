[core-utils](../../index.md) / [com.sophoun.android.framework.query](../index.md) / [SelectQueryBuilder](index.md) / [&lt;init&gt;](./-init-.md)

# &lt;init&gt;

`SelectQueryBuilder(contentResolver: <ERROR CLASS>)`

This class use for query data from android database
using ContentProvider

Sample usage:

```
SelectQueryBuilder<Album>(context?.contentResolver!!)
      .projection(
         MediaStore.Audio.Playlists._ID,
         MediaStore.Audio.Playlists.NAME
      ).orderBy("${MediaStore.Audio.Playlists.NAME} ASC")
      .uri(MediaStore.Audio.Playlists.Members.getContentUri("external", 2818))
      .mapper {
         Album(
             it.getInt(it.getColumnIndex(MediaStore.Audio.Playlists._ID)),
             it.getString(it.getColumnIndex(MediaStore.Audio.Playlists.NAME))
         )
      }.onResult {
         DLog.i("Result", it.distinct().toString())
      }.onError {
         DLog.i("Result", it.message.toString())
      }.execute()
```

