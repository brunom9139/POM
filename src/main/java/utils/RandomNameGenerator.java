package utils;
import java.util.Random;

public class RandomNameGenerator {

    /*
    public static void main(String[] args) {
        System.out.println(obtenerNombreModificado());
        System.out.println(obtenerApellidoModificado());
    }

     */


    public static String obtenerNombreModificado() {
        String[] nombres = {
                "Ana", "Beatriz", "Carlos", "David", "Elena", "Fernando",
                "Gabriela", "Hugo", "Irene", "Javier", "Karla", "Luis",
                "María", "Nicolás", "Olivia", "Pablo", "Queralt", "Roberto",
                "Sofía", "Tomás", "Ursula", "Valeria", "William", "Ximena",
                "Yolanda", "Zoe", "Alejandro", "Carmen", "Felipe", "Lucía",
                "Marta", "Óscar", "Patricia", "Raúl", "Silvia", "Teresa",
                "Víctor", "Laura", "Daniel", "Consuelo", "Francisco", "Gloria",
                "Isabel", "Juan", "Lorena", "Martín", "Natalia", "Pedro",
                "Ricardo", "Sara", "Vanesa", "Esteban", "Rosa", "Antonio",
                "Claudia", "Diego", "Eva", "Gustavo", "Helena", "Iván",
                "José", "Kristina", "Leonardo", "Mónica", "Norberto", "Paloma",
                "Ramón", "Susana", "Trinidad", "Violeta", "Lidia", "Arnaldo",
                "Bianca", "César", "Dolores", "Ernesto", "Fabián", "Graciela",
                "Hernán", "Inés", "Joaquín", "Keila", "Leandro", "Miriam",
                "Noel", "Olga", "Priscila", "Renato", "Samuel", "Tatiana",
                "Umberto", "Verónica", "Walter", "Xavier", "Yesenia", "Zacarías"
        };

        // Generar un índice aleatorio y seleccionar un nombre
        Random rand = new Random();
        String nombreSeleccionado = nombres[rand.nextInt(nombres.length)];

        // Eliminar la primera letra
        String nombreModificado = nombreSeleccionado.substring(1);

        // Verificar si termina en vocal y no es de un solo caracter
        if (nombreModificado.length() > 1 && esVocal(nombreModificado.charAt(nombreModificado.length() - 1))) {
            nombreModificado = nombreModificado.substring(0, nombreModificado.length() - 1);
            // Agregar una letra mayúscula al inicio y dos minúsculas al final
            return letraAleatoriaMayuscula() + nombreModificado + letrasAleatoriasMinusculas();
        } else {
            // Solo agregar una letra mayúscula al inicio
            return letraAleatoriaMayuscula() + nombreModificado;
        }
    }


    public static String generateAnimalStringWithNumber() {
        // Array con al menos 100 nombres de animales de 5 letras cada uno
        String[] animals = {
                "perro", "gatoo", "raton", "burro", "lobo", "cabra", "jiraf", "cebra", "tigre", "oso",
                "panda", "cabro", "pajaro", "mosca", "pulpo", "ballena", "delfin", "foca", "gallo", "ganso",
                "leon", "liebre", "morsa", "mula", "orca", "puma", "pollo", "rana", "sapo", "tordo",
                "vaca", "yegua", "zorro", "abeja", "ardilla", "burra", "camello", "castor", "ciervo", "cisne",
                "corzo", "cuervo", "elefante", "flamenco", "golondrina", "gorrion", "halcon", "hormiga", "iguana", "koala",
                "lagarto", "lechuza", "loro", "murcielago", "paloma", "pantera", "pingüino", "rinoceronte", "serpiente", "tapir",
                "topo", "tortuga", "turon", "zebra", "bufalo", "coyote", "escorpion", "gorila", "jaguar", "koala",
                "krill", "lagartija", "langosta", "leon", "liebre", "lombriz", "luciernaga", "manati", "mofeta", "nutria",
                "perezoso", "rata", "saltamontes", "suricato", "tarantula", "tiburon", "tigre", "toro", "tucan", "urraca",
                "venado", "wallaby", "yak", "zorrillo", "caballo", "canguro", "chinchilla", "huron", "lince", "murcielago"
        };
        if (animals == null || animals.length < 100) {
            throw new IllegalArgumentException("El array debe contener al menos 100 nombres de animales.");
        }

        Random random = new Random();
        // Seleccionar un animal aleatorio del array
        String animal = animals[random.nextInt(animals.length)];

        // Generar un número aleatorio entre 00 y 99
        int randomNumber = random.nextInt(100);

        // Formatear el número para que siempre tenga dos dígitos
        String formattedNumber = String.format("%02d", randomNumber);

        return animal + formattedNumber;
        //String result = generateAnimalStringWithNumber(animals);
        //System.out.println(result);
    }

    public static String obtenerApellidoModificado() {
        String[] apellidos = {
                "García", "Fernández", "González", "Rodríguez", "López", "Martínez",
                "Sánchez", "Pérez", "Gómez", "Martín", "Jiménez", "Ruiz",
                "Hernández", "Díaz", "Moreno", "Muñoz", "Álvarez", "Romero",
                "Alonso", "Gutiérrez", "Navarro", "Torres", "Domínguez", "Vázquez",
                "Ramos", "Gil", "Ramírez", "Serrano", "Blanco", "Molina",
                "Morales", "Suárez", "Ortega", "Delgado", "Castro", "Ortiz",
                "Rubio", "Marín", "Sanz", "Iglesias", "Nuñez", "Medina", "Garrido",
                "Cortés", "Castillo", "Santos", "Lozano", "Guerrero", "Cano",
                "Prieto", "Méndez", "Cruz", "Calvo", "Gallego", "Herrera",
                "Marquez", "Peña", "Vidal", "León", "Ibáñez", "Pascual",
                "Vega", "Nieto", "Reyes", "Aguilar", "Pardo", "Mercado",
                "Vargas", "Soler", "Pastor", "Velasco", "Moya", "Soto",
                "Rojas", "Parra", "Esteban", "Bravo", "Gallardo", "Rojas",
                "Sáez", "Montes", "Arias", "Lorenzo", "Montero", "Hidalgo",
                "Giménez", "Ibañez", "Ferrer", "Duran", "Vicente", "Benítez",
                "Mora", "Santiago", "Vera", "Rivas", "Arias", "Andrade",
                "Ponce", "Santana", "Quintana", "Galindo", "Crespo", "Roman",
                "Palacios", "Varela", "Briones", "Guerra", "Mesa", "Campos"
        };

        // Generar un índice aleatorio y seleccionar un apellido
        Random rand = new Random();
        String apellidoSeleccionado = apellidos[rand.nextInt(apellidos.length)];

        // Eliminar la primera letra
        String apellidoModificado = apellidoSeleccionado.substring(1);

        // Verificar si termina en vocal y no es de un solo caracter
        if (apellidoModificado.length() > 1 && esVocal(apellidoModificado.charAt(apellidoModificado.length() - 1))) {
            apellidoModificado = apellidoModificado.substring(0, apellidoModificado.length() - 1);
            // Agregar una letra mayúscula al inicio y dos minúsculas al final
            return letraAleatoriaMayuscula() + apellidoModificado + letrasAleatoriasMinusculas();
        } else {
            // Solo agregar una letra mayúscula al inicio
            return letraAleatoriaMayuscula() + apellidoModificado;
        }
    }

    // Función para determinar si un carácter es una vocal
    public static boolean esVocal(char c) {
        return "AEIOUaeiou".indexOf(c) != -1;
    }

    // Generar una letra mayúscula aleatoria
    public static String letraAleatoriaMayuscula() {
        Random rand = new Random();
        return String.valueOf((char) (rand.nextInt(26) + 'A'));
    }

    // Generar dos letras minúsculas aleatorias
    public static String letrasAleatoriasMinusculas() {
        Random rand = new Random();
        return String.valueOf((char) (rand.nextInt(26) + 'a')) +
                String.valueOf((char) (rand.nextInt(26) + 'a'));
    }

}
