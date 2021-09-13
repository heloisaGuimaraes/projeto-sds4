import { Seller } from './seller'

export type Sale = {
    id: number;
    visited: number;
    deals: number;
    amount: number;
    date: string;
    seller: Seller;
}

export type SalePage = {
    content?: Sale[];
    last: boolean;
    totalPages: number;
    totalElements: number;
    first: boolean;
    number: number;
    numberOfElements?: number;
    size?: number;
    empty?: boolean;
}

export type SaleSum = {
    sallerName: string;
    sum: number;
}

export type SaleSuccess = {

    sallerName: string;
    visited: number;
    deals: number;
}