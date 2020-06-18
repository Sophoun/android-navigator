[core-utils](../../index.md) / [com.sophoun.android.framework.service](../index.md) / [BaseService](./index.md)

# BaseService

`abstract class BaseService`

This class musts work with ServiceManager class
to make it easy while bind, unbind and handle message
receive from each other.

### Types

| Name | Summary |
|---|---|
| [IncomingHandler](-incoming-handler/index.md) | `inner class IncomingHandler` |

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `BaseService()`<br>This class musts work with ServiceManager class to make it easy while bind, unbind and handle message receive from each other. |

### Properties

| Name | Summary |
|---|---|
| [coroutineContext](coroutine-context.md) | `open val coroutineContext: <ERROR CLASS>` |

### Functions

| Name | Summary |
|---|---|
| [onBind](on-bind.md) | `open fun onBind(intent: <ERROR CLASS>?): <ERROR CLASS>?` |
| [onCreate](on-create.md) | `open fun onCreate(): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |
| [onDestroy](on-destroy.md) | `open fun onDestroy(): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |
| [onMessageReceive](on-message-receive.md) | `abstract fun onMessageReceive(msg: <ERROR CLASS>): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Handle message that sent from ServiceManager |
| [sendMessage](send-message.md) | `fun sendMessage(what: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`, bundle: <ERROR CLASS>? = null): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Send message to replyTo messengers |
