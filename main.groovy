import groovy.json.JsonBuilder
import groovy.json.JsonSlurper

File f = new File('/var/jenkins_home/workspace/test_groovy/template.json')
def slurped = new JsonSlurper().parseText(f.text)
def builder = new JsonBuilder(slurped)

builder.content.builders[0].image_name = 'Aricent_Image_1'

println(builder.toPrettyString())
