import { Pipe, PipeTransform } from '@angular/core';

@Pipe({
  name: 'filter'
})
export class FilterPipe implements PipeTransform {

  transform(items: any[], searchText: string): any[] {
    if (!items) return [];
    if (!searchText) return items;
    console.log('search', searchText);

    searchText = searchText.toLowerCase();
    return items.filter(it => {
      return it.id.toLowerCase().includes(searchText);
    });
  }

}
