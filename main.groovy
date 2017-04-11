import groovy.json.JsonBuilder
import groovy.json.JsonSlurper
def fileName = "packer.json"
File f = new File('template.json')
def slurped = new JsonSlurper().parseText(f.text)
def builder = new JsonBuilder(slurped)

builder.content.builders[0].image_name = 'Aricent_Image_1'

def inputFile = new File(fileName)
if(inputFile.exists())
{
 Println("A file named " + fileName + " already exisits in the same folder")
}
else
{
 inputFile.write(builder.toPrettyString())
 println("The Content Written to the file " + fileName + "is")
 println(builder.toPrettyString())
}
