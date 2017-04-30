An implementation of font awesome icons as String in java.
See Sample format in JavaFx and Swing.

Ensure have the font file "fontawesome-webfont.ttf"
in the same directory as FA.java file.

If font is not installed as a system font, you have to
load it in your application. See sample.

All icon names follow fontawsone css names 
with hyphens, "-", replaced by underscore, "_".
example icon <code>.fa-home</code> would be 
accessible by calling static valuable HOME i.e.
<code> FA.HOME </code>

example:
java code: 
<code>String s= "Welcome "+FA.HOME;</code>
would have same output as HTML code;
<code>
<p>Welcome <i class="fa fa-home"></i></p>
</code>