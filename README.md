# sbt-mdoc-base

[sbt-mdoc](https://github.com/scalameta/mdoc) をインストールして最低限のことをできるようにしたプロジェクトです。

## Usage

`memos` ディレクトリ下の md ファイル内でコードブロックを書き、以下のコマンドを実行すると、コードの実行結果が書き込まれます。

```
% sbt
> docs/mdoc
```

## Examples

以下の `memos/readme.md` に対して

<pre>
# Sbt-Mdoc base project

```scala
libraryDependencies += "com" % "lib" % "@VERSION@"
```

```scala mdoc
val x = 1
List(x, x)
```
</pre>
`docs/mdoc` を実行すると、`docs/src/main/readme.md` が生成されます。

<pre>
# Sbt-Mdoc base project

```scala
libraryDependencies += "com" % "lib" % "0.1.0-SNAPSHOT"
```

```scala
val x = 1
// x: Int = 1
List(x, x)
// res0: List[Int] = List(1, 1)
```
</pre>
