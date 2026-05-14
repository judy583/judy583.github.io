from flask import Flask, render_template

app = Flask(__name__)

@app.route('/')
def index():
    return "Hello! Go to /form or /thanks"

@app.route('/form')
def form():
    return render_template("favorite_form.html")

@app.route('/thanks')
def thanks():
    return render_template("tynote.html", 
                           name="Bob", 
                           gift="iPad", 
                           verb="drawing", 
                           noun="artist", 
                           closing_word="Best", 
                           author="Judy")
