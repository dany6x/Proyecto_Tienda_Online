import { Component } from '@angular/core';

@Component({
  selector: 'app-cart',
  templateUrl: './carrito.component.html',
  styleUrls: ['./carrito.component.css']
})
export class CarritoComponent {
  cartItems = []; // Aquí debes definir la variable que contiene los productos del carrito

  removeFromCarrito(item: any) {
    // Lógica para eliminar un producto del carrito
  }

  getTotalPrice() {
    // Lógica para calcular el precio total del carrito
    return 0; // Debes implementar esta lógica
  }
}
