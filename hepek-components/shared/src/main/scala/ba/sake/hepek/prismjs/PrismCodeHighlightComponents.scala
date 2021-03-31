package ba.sake.hepek.prismjs

import scala.collection.mutable.ListBuffer
import ba.sake.hepek.scalatags.all._
import ba.sake.hepek.html.component.CodeHighlightComponents
import ba.sake.hepek.html.component.CodeHighlighter

object PrismCodeHighlightComponents extends PrismCodeHighlightComponents {
  sealed trait CodeSource

  object CodeSource {
    final case class PlainText(text: String)                      extends CodeSource
    final case class AJAX(url: String)                            extends CodeSource // any file on the web
    final case class JSONP(url: String, fileName: Option[String]) extends CodeSource // Github, Gist, Bitbucket
  }
}

trait PrismCodeHighlightComponents extends CodeHighlightComponents {
  def showLineNumbers: Boolean = true

  override def abap = PrismCodeHighlighter("abap", showLineNumbers)

  override def actionscript =
    PrismCodeHighlighter("actionscript", showLineNumbers)
  override def ada        = PrismCodeHighlighter("ada", showLineNumbers)
  override def apacheconf = PrismCodeHighlighter("apacheconf", showLineNumbers)
  override def apl        = PrismCodeHighlighter("apl", showLineNumbers)

  override def applescript =
    PrismCodeHighlighter("applescript", showLineNumbers)
  override def arduino    = PrismCodeHighlighter("arduino", showLineNumbers)
  override def asciidoc   = PrismCodeHighlighter("asciidoc", showLineNumbers)
  override def asm6502    = PrismCodeHighlighter("asm6502", showLineNumbers)
  override def aspnet     = PrismCodeHighlighter("aspnet", showLineNumbers)
  override def autohotkey = PrismCodeHighlighter("autohotkey", showLineNumbers)
  override def autoit     = PrismCodeHighlighter("autoit", showLineNumbers)
  override def bash       = PrismCmdHighlighter("bash")
  override def basic      = PrismCodeHighlighter("basic", showLineNumbers)
  override def batch      = PrismCmdHighlighter("batch")
  override def bison      = PrismCodeHighlighter("bison", showLineNumbers)
  override def brainfuck  = PrismCodeHighlighter("brainfuck", showLineNumbers)
  override def bro        = PrismCodeHighlighter("bro", showLineNumbers)
  override def c          = PrismCodeHighlighter("c", showLineNumbers)
  override def clike      = PrismCodeHighlighter("clike", showLineNumbers)

  override def coffeescript =
    PrismCodeHighlighter("coffeescript", showLineNumbers)
  override def cpp        = PrismCodeHighlighter("cpp", showLineNumbers)
  override def crystal    = PrismCodeHighlighter("crystal", showLineNumbers)
  override def csharp     = PrismCodeHighlighter("csharp", showLineNumbers)
  override def css        = PrismCodeHighlighter("css", showLineNumbers)
  override def cssExtras  = PrismCodeHighlighter("css-extras", showLineNumbers)
  override def csp        = PrismCodeHighlighter("csp", showLineNumbers)
  override def d          = PrismCodeHighlighter("d", showLineNumbers)
  override def dart       = PrismCodeHighlighter("dart", showLineNumbers)
  override def diff       = PrismCodeHighlighter("diff", showLineNumbers)
  override def django     = PrismCodeHighlighter("django", showLineNumbers)
  override def docker     = PrismCodeHighlighter("docker", showLineNumbers)
  override def eiffel     = PrismCodeHighlighter("eiffel", showLineNumbers)
  override def elixir     = PrismCodeHighlighter("elixir", showLineNumbers)
  override def elm        = PrismCodeHighlighter("elm", showLineNumbers)
  override def erlang     = PrismCodeHighlighter("erlang", showLineNumbers)
  override def flow       = PrismCodeHighlighter("flow", showLineNumbers)
  override def fortran    = PrismCodeHighlighter("fortran", showLineNumbers)
  override def fsharp     = PrismCodeHighlighter("fsharp", showLineNumbers)
  override def gherkin    = PrismCodeHighlighter("gherkin", showLineNumbers)
  override def git        = PrismCodeHighlighter("git", showLineNumbers)
  override def glsl       = PrismCodeHighlighter("glsl", showLineNumbers)
  override def go         = PrismCodeHighlighter("go", showLineNumbers)
  override def graphql    = PrismCodeHighlighter("graphql", showLineNumbers)
  override def groovy     = PrismCodeHighlighter("groovy", showLineNumbers)
  override def haml       = PrismCodeHighlighter("haml", showLineNumbers)
  override def handlebars = PrismCodeHighlighter("handlebars", showLineNumbers)
  override def haskell    = PrismCodeHighlighter("haskell", showLineNumbers)
  override def haxe       = PrismCodeHighlighter("haxe", showLineNumbers)
  override def hpkp       = PrismCodeHighlighter("hpkp", showLineNumbers)
  override def hsts       = PrismCodeHighlighter("hsts", showLineNumbers)
  override def http       = PrismCodeHighlighter("http", showLineNumbers)
  override def ichigojam  = PrismCodeHighlighter("ichigojam", showLineNumbers)
  override def icon       = PrismCodeHighlighter("icon", showLineNumbers)
  override def inform7    = PrismCodeHighlighter("inform7", showLineNumbers)
  override def ini        = PrismCodeHighlighter("ini", showLineNumbers)
  override def io         = PrismCodeHighlighter("io", showLineNumbers)
  override def j          = PrismCodeHighlighter("j", showLineNumbers)
  override def java       = PrismCodeHighlighter("java", showLineNumbers)
  override def javascript = PrismCodeHighlighter("javascript", showLineNumbers)
  override def jolie      = PrismCodeHighlighter("jolie", showLineNumbers)
  override def json       = PrismCodeHighlighter("json", showLineNumbers)
  override def jsx        = PrismCodeHighlighter("jsx", showLineNumbers)
  override def julia      = PrismCodeHighlighter("julia", showLineNumbers)
  override def keyman     = PrismCodeHighlighter("keyman", showLineNumbers)
  override def kotlin     = PrismCodeHighlighter("kotlin", showLineNumbers)
  override def latex      = PrismCodeHighlighter("latex", showLineNumbers)
  override def less       = PrismCodeHighlighter("less", showLineNumbers)
  override def livescript = PrismCodeHighlighter("livescript", showLineNumbers)
  override def lolcode    = PrismCodeHighlighter("lolcode", showLineNumbers)
  override def lua        = PrismCodeHighlighter("lua", showLineNumbers)
  override def makefile   = PrismCodeHighlighter("makefile", showLineNumbers)
  override def markdown   = PrismCodeHighlighter("markdown", showLineNumbers)
  override def markup     = PrismCodeHighlighter("markup", showLineNumbers, true)
  override def matlab     = PrismCodeHighlighter("matlab", showLineNumbers)
  override def mel        = PrismCodeHighlighter("mel", showLineNumbers)
  override def mizar      = PrismCodeHighlighter("mizar", showLineNumbers)
  override def monkey     = PrismCodeHighlighter("monkey", showLineNumbers)
  override def n4js       = PrismCodeHighlighter("n4js", showLineNumbers)
  override def nasm       = PrismCodeHighlighter("nasm", showLineNumbers)
  override def nginx      = PrismCodeHighlighter("nginx", showLineNumbers)
  override def nim        = PrismCodeHighlighter("nim", showLineNumbers)
  override def nix        = PrismCodeHighlighter("nix", showLineNumbers)
  override def nsis       = PrismCodeHighlighter("nsis", showLineNumbers)
  override def objectivec = PrismCodeHighlighter("objectivec", showLineNumbers)
  override def ocaml      = PrismCodeHighlighter("ocaml", showLineNumbers)
  override def opencl     = PrismCodeHighlighter("opencl", showLineNumbers)
  override def oz         = PrismCodeHighlighter("oz", showLineNumbers)
  override def parigp     = PrismCodeHighlighter("parigp", showLineNumbers)
  override def parser     = PrismCodeHighlighter("parser", showLineNumbers)
  override def pascal     = PrismCodeHighlighter("pascal", showLineNumbers)
  override def perl       = PrismCodeHighlighter("perl", showLineNumbers)
  override def php        = PrismCodeHighlighter("php", showLineNumbers)
  override def phpExtras  = PrismCodeHighlighter("php-extras", showLineNumbers)
  override def powershell = PrismCmdHighlighter("powershell")
  override def processing = PrismCodeHighlighter("processing", showLineNumbers)
  override def prolog     = PrismCodeHighlighter("prolog", showLineNumbers)
  override def properties = PrismCodeHighlighter("properties", showLineNumbers)
  override def protobuf   = PrismCodeHighlighter("protobuf", showLineNumbers)
  override def pug        = PrismCodeHighlighter("pug", showLineNumbers)
  override def puppet     = PrismCodeHighlighter("puppet", showLineNumbers)
  override def pure       = PrismCodeHighlighter("pure", showLineNumbers)
  override def python     = PrismCodeHighlighter("python", showLineNumbers)
  override def q          = PrismCodeHighlighter("q", showLineNumbers)
  override def qore       = PrismCodeHighlighter("qore", showLineNumbers)
  override def r          = PrismCodeHighlighter("r", showLineNumbers)
  override def reason     = PrismCodeHighlighter("reason", showLineNumbers)
  override def renpy      = PrismCodeHighlighter("renpy", showLineNumbers)
  override def rest       = PrismCodeHighlighter("rest", showLineNumbers)
  override def rip        = PrismCodeHighlighter("rip", showLineNumbers)
  override def roboconf   = PrismCodeHighlighter("roboconf", showLineNumbers)
  override def ruby       = PrismCodeHighlighter("ruby", showLineNumbers)
  override def rust       = PrismCodeHighlighter("rust", showLineNumbers)
  override def sas        = PrismCodeHighlighter("sas", showLineNumbers)
  override def sass       = PrismCodeHighlighter("sass", showLineNumbers)
  override def scala      = PrismCodeHighlighter("scala", showLineNumbers)
  override def scheme     = PrismCodeHighlighter("scheme", showLineNumbers)
  override def scss       = PrismCodeHighlighter("scss", showLineNumbers)
  override def smalltalk  = PrismCodeHighlighter("smalltalk", showLineNumbers)
  override def smarty     = PrismCodeHighlighter("smarty", showLineNumbers)
  override def sql        = PrismCodeHighlighter("sql", showLineNumbers)
  override def stylus     = PrismCodeHighlighter("stylus", showLineNumbers)
  override def swift      = PrismCodeHighlighter("swift", showLineNumbers)
  override def tcl        = PrismCodeHighlighter("tcl", showLineNumbers)
  override def textile    = PrismCodeHighlighter("textile", showLineNumbers)
  override def tsx        = PrismCodeHighlighter("tsx", showLineNumbers)
  override def twig       = PrismCodeHighlighter("twig", showLineNumbers)
  override def typescript = PrismCodeHighlighter("typescript", showLineNumbers)
  override def vbnet      = PrismCodeHighlighter("vbnet", showLineNumbers)
  override def verilog    = PrismCodeHighlighter("verilog", showLineNumbers)
  override def vhdl       = PrismCodeHighlighter("vhdl", showLineNumbers)
  override def vim        = PrismCodeHighlighter("vim", showLineNumbers)
  override def wiki       = PrismCodeHighlighter("wiki", showLineNumbers)
  override def xeora      = PrismCodeHighlighter("xeora", showLineNumbers)
  override def xojo       = PrismCodeHighlighter("xojo", showLineNumbers)
  override def yaml       = PrismCodeHighlighter("yaml", showLineNumbers)
}

/* "normal" code highlighter */
object PrismCodeHighlighter {

  def apply(
      lang: String,
      showLineNumbers: Boolean,
      isMarkup: Boolean = false
  ): PrismCodeHighlighter = {
    val lineNums = if (showLineNumbers) Option(1) else None
    PrismCodeHighlighter(lang, lineNums, None, isMarkup)
  }
}

final case class PrismCodeHighlighter(
    lang: String,
    lineNumbers: Option[Int],
    lineHighlight: Option[(String, Int)],
    isMarkup: Boolean
) extends BaseCodeHighlighter(
      lang,
      lineNumbers,
      lineHighlight,
      None,
      isMarkup
    ) {

  def withLineNumsStart(startFrom: Int) =
    this.copy(lineNumbers = Option(startFrom))

  def withLineHighlight(lines: String, offset: Int = 0) =
    this.copy(lineHighlight = Option(lines -> offset))
}

/* command-line code highlighter */
object PrismCmdHighlighter {

  def apply(lang: String): PrismCmdHighlighter =
    PrismCmdHighlighter(
      lang,
      None,
      CommandLineOptions(None, Left("root" -> "localhost"))
    )
}

final case class PrismCmdHighlighter(
    lang: String,
    lineHighlight: Option[(String, Int)],
    commandLine: CommandLineOptions
) extends BaseCodeHighlighter(
      lang,
      None, // can't have line numbers when CMD
      lineHighlight,
      Option(commandLine),
      false
    ) {

  def withLineHighlight(lines: String, offset: Int = 0) =
    this.copy(lineHighlight = Option(lines -> offset))

  def withUser(cmdUser: String, cmdHost: String = "localhost") =
    this.copy(commandLine = commandLine.copy(prefix = Left(cmdUser, cmdHost)))

  def withPrompt(cmdPrompt: String) =
    this.copy(commandLine = commandLine.copy(prefix = Right(cmdPrompt)))

  def withOutputLines(cmdOutputLines: String) =
    this.copy(
      commandLine = commandLine.copy(outputLines = Option(cmdOutputLines))
    )
}

object BaseCodeHighlighter {
  import PrismCodeHighlightComponents._
  import CodeSource._

  /* does ALL THE JOB :D */
  private def highlight(
      lang: String,
      lineNumbers: Option[Int],
      lineHighlight: Option[(String, Int)],
      commandLine: Option[CommandLineOptions],
      isMarkup: Boolean, // via unescaped-markup plugin
      codeSource: CodeSource
  ): Frag = {
    // additional classes and attributes
    val classes = ListBuffer.empty[String]
    val attrs   = ListBuffer.empty[Modifier]
    // command-line
    commandLine.foreach { cl =>
      classes += "command-line"
      cl.outputLines.foreach { o =>
        attrs += (data.output := o)
      }
      cl.prefix.fold(
        {
          case (commandLineUser, commandLineHost) =>
            attrs += (data.user := commandLineUser)
            attrs += (data.host := commandLineHost)
        }, { commandLinePrompt =>
          attrs += (data.prompt := commandLinePrompt)
        }
      )
    }
    // line highlight or CMD output
    lineHighlight.foreach {
      case (lh, o) =>
        attrs += (data.line := lh)
        attrs += (data.line.offset := o)
    }
    // line numbers
    lineNumbers.foreach { lineNumsStart =>
      classes += "line-numbers"
      attrs += (data.start := lineNumsStart.toString)
    }
    // final result
    val languageClass = s"language-$lang"
    codeSource match {
      case PlainText(text) => {
        val content: Frag = if (isMarkup) {
          val unindentedMarkup =
            ba.sake.hepek.utils.StringUtils.unindent(text).trim
          p(raw(s"<!--$unindentedMarkup-->")) // ugly hack! :D
        } else {
          text
        }
        pre(classes.map(cls := _).toSeq, attrs.toSeq)(
          code(cls := languageClass)(content)
        )
      }
      case AJAX(url) => {
        attrs += (data.src := url)
        pre(cls := languageClass, classes.map(cls := _).toSeq, attrs.toSeq)
      }
      case JSONP(url, fileName) => {
        attrs += (data.jsonp := url)
        fileName.foreach { fn =>
          attrs += (data.filename := fn)
        }
        pre(cls := languageClass, classes.map(cls := _).toSeq, attrs.toSeq)
      }
    }
  }

  def highlightInline(lang: String, content: String): Frag =
    code(cls := s"language-$lang")(content)
}

abstract class BaseCodeHighlighter(
    lang: String,
    lineNumbers: Option[Int],
    lineHighlight: Option[(String, Int)],
    commandLine: Option[CommandLineOptions],
    isMarkup: Boolean
) extends CodeHighlighter {
  import BaseCodeHighlighter._
  import PrismCodeHighlightComponents._
  import CodeSource._

  // code without any additional parameters
  override def apply(text: String): Frag =
    highlight(
      lang,
      lineNumbers,
      lineHighlight,
      commandLine,
      isMarkup,
      PlainText(text)
    )

  def inline(text: String): Frag =
    highlightInline(lang, text)

  /** Fetches a file from url via AJAX. */
  def ajax(url: String): Frag =
    highlight(
      lang,
      lineNumbers,
      lineHighlight,
      commandLine,
      isMarkup,
      AJAX(url)
    )

  /** Fetches a file from url via JSONP. Supported sites: Github, Gist, Bitbucket <br>
    *  Optionally provide gist fileName */
  def jsonp(url: String, fileName: Option[String] = None): Frag =
    highlight(
      lang,
      lineNumbers,
      lineHighlight,
      commandLine,
      isMarkup,
      JSONP(url, fileName)
    )

  /** @param id Id of the Gist, e.g. "65a82e76597f2fb6c2af" */
  def gist(id: String, fileName: Option[String] = None): Frag =
    jsonp(s"https://api.github.com/gists/$id", fileName)

  /**
    * @param user Github user, e.g. "TheAdnan"
    * @param repo User's repo, e.g. "focustube"
    * @param filePath Path of the file, e.g. "bla/index.js"
    */
  def github(user: String, repo: String, filePath: String): Frag =
    jsonp(s"https://api.github.com/repos/$user/$repo/contents/$filePath")
}

final case class CommandLineOptions(
    outputLines: Option[String],
    prefix: Either[(String, String), String] // (user,host) or custom
)
