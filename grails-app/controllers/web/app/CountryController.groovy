package web.app

import grails.gorm.transactions.Transactional

@Transactional(readOnly = false)
class CountryController {

    def index() { }

    def result() {
        def tempSelected = params.myTemps
        def convertedTemp

        if (tempSelected == 'C') {
            convertedTemp = convertTempCtoF(params.temp.toInteger())
        } else {
            convertedTemp = convertTempFtoC(params.temp.toInteger())
        }
        render(view: "result", model: [convertedTemp: convertedTemp])
    }

    def convertTempCtoF(tempC) {
        return (tempC * 9)/5 + 32
    }

    def convertTempFtoC(tempF) {
        return (tempF - 32) * 5/9
    }
}
