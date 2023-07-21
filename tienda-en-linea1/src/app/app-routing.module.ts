import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { LoginComponent } from './login/login.component';
import { HomeComponent } from './home/home.component';
import { RegisterComponent } from './register/register.component';
import { DomicilioComponent } from './domicilio/domicilio.component';
import { CarritoComponent } from './carrito/carrito.component';
import { PagoComponent } from './pago/pago.component';
import { TablaadminComponent } from './tablaadmin/tablaadmin.component';
import { AgregarProductoComponent } from './agregar-producto/agregar-producto.component';
import { EditarProductoComponent } from './editar-producto/editar-producto.component';




const routes: Routes = [
  { path: 'login', component: LoginComponent },
  { path: 'home', component: HomeComponent },
  { path: 'register', component: RegisterComponent },
  { path: 'domicilio', component: DomicilioComponent },
  { path: 'carrito', component: CarritoComponent },
  { path: '', redirectTo: '/home', pathMatch: 'full' },
  { path: 'pago', component: PagoComponent },
  { path: 'tablaadmin', component: TablaadminComponent },
  { path: 'agregar-producto', component: AgregarProductoComponent },
  { path: 'editar-producto', component: EditarProductoComponent },

];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})

export class AppRoutingModule { }
