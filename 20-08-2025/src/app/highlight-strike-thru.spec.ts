import { ElementRef } from '@angular/core';
import { HighlightStrikeThru } from './highlight-strike-thru';

describe('HighlightStrikeThru', () => {
  it('should create an instance', () => {
    const mockElement = document.createElement('p'); 
    const mockElementRef = new ElementRef(mockElement);
    const directive = new HighlightStrikeThru(mockElementRef);
    expect(directive).toBeTruthy();
  });
});
