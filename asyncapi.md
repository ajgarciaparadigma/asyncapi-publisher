# Hello Kafka API 1.0.0 documentation

* License: [Apache 2.0](https://www.apache.org/licenses/LICENSE-2.0)
* Default content type: [application/json](https://www.iana.org/assignments/media-types/application/json)

Example to ilustrate kafka generator


## Table of Contents

* [Servers](#servers)
  * [test](#test-server)
* [Operations](#operations)
  * [PUB com.paradigma.event.hello](#pub-comparadigmaeventhello-operation)
  * [SUB com.paradigma.event.hello](#sub-comparadigmaeventhello-operation)

## Servers

### `test` Server

* URL: `pkc-6ojv2.us-west4.gcp.confluent.cloud:9092`
* Protocol: `userPassword`

Test broker


## Operations

### PUB `com.paradigma.event.hello` Operation

Greeting topic.

#### Message `<anonymous-message-1>`

##### Payload

| Name | Type | Description | Value | Constraints | Notes |
|---|---|---|---|---|---|
| (root) | string | - | - | pattern (`^hello .+$`) | - |

> Examples of payload _(generated)_

```json
"string"
```



### SUB `com.paradigma.event.hello` Operation

* Operation ID: `consumeGreetings`

Greeting topic.

#### Message `<anonymous-message-2>`

##### Payload

| Name | Type | Description | Value | Constraints | Notes |
|---|---|---|---|---|---|
| (root) | string | - | - | - | - |

> Examples of payload _(generated)_

```json
"string"
```



