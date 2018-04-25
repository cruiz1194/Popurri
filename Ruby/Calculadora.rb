def suma(a,b)
  resultado = a + b
end

puts "Hola desde Ruby, esto es una calculadora"
puts "Introduce qué operación quieres hacer: "
puts "1. Suma \n 2. Resta \n 3. Multiplicación \n 4. División \n 5. Potencia"
puts "Operación: "
STDOUT.flush
operacion = gets.chomp

if operacion == "1"
  puts "Introduzca los numeros uno por uno"
  puts "1 = "
  STDOUT.flush
  a = gets.chomp
  a = a.to_i
  puts "2 = "
  STDOUT.flush
  b = gets.chomp
  b = b.to_i
  puts "Resultado: #{suma(a,b)}"
end
# gets
