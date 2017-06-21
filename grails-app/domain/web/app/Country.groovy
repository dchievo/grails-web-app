package web.app

class Country {
    String id
    String name
    String continent

    static mapping = {
        table 'Country'
        version false

        id column: 'Code', generator: 'assigned'
    }

    static constraints = {
        id maxSize: 3, blank: false, unique: true
        name blank: false
        continent nullable: false
        continent inList: ['America','Africa','Oceania','Antarctica','South America']
    }
}
