import { useEffect, useState } from 'react';
import './styles.css';
import ProductsList from './ProductsList';
import StepsHeader from './StepsHeafer';
import { OrderLocariondata, Product } from './types';
import { fetchProducts } from '../api';
import OrderLocation from './OrderLocation';


function Orders() {
  const [products, setProducts] = useState<Product[]>([])

  const [orderLocation, setOrderLocation] = useState<OrderLocariondata>();

  useEffect(() => {
    fetchProducts()
      .then(response => setProducts(response.data))
      .catch(error => console.log(error)
      )
  }, []);

  return (
    <div className="orders-container">
      <StepsHeader />
      <ProductsList products={products} />
      <OrderLocation onChangeLocation={location => setOrderLocation(location)} />
    </div>
  )
}

export default Orders;