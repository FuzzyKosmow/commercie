import { Skeleton } from "@mui/material";

export const ProductBox = (product: IProduct) => {
  return (
    <div>
      <Skeleton variant="rectangular" width={210} height={118} />
      <h2>{product.name}</h2>
      <p>{product.price}</p>
    </div>
  );
};
